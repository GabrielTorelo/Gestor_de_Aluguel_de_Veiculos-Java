package Service;


import DataBase.BDveiculo;
import Exception.PlacaNegException;
import Exception.AnoNegException;
import Exception.PrecoNegException;
import Service.Request.ServiceRequest;
import Model.Veiculo;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceVeiculo {

    private static final ServiceRequest request = ServiceRequest.getInstance();
    private static final BDveiculo bdVei = new BDveiculo();
    private static Veiculo veiculo;

    //Lista veículos
    public static BDveiculo verVeiculos() {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("vehicle"));
        int qtdVeiculos = jsonArr.length();

        try {
            for (int i = 0; i < qtdVeiculos; i++) {
                veiculo = new Veiculo();

                JSONObject jsonObj = jsonArr.getJSONObject(i);

                veiculo.setPreco(jsonObj.getInt("price"));
                veiculo.setPlaca(jsonObj.getString("plate"));
                veiculo.setAno(jsonObj.getString("year"));
                veiculo.setModelo(jsonObj.getString("model"));

                bdVei.cad_Vei(veiculo);
            }
        } catch (PrecoNegException pre) {
            System.out.println("Erro ao Inserir Veiculo -> Preço!");
            return null;
        } catch (PlacaNegException pla) {
            System.out.println("Erro ao Inserir Veiculo -> Placa!");
            return null;
        } catch (AnoNegException ane) {
            System.out.println("Erro ao Inserir Veiculo -> Ano do Veículo!");
            return null;
        }

        return bdVei;
    }

    //Cria novo veículo
    public static String criaVeiculo(Veiculo vei) throws UnsupportedEncodingException {
        String bodyJson = new JSONObject()
                .put("price", vei.getPreco())
                .put("plate", vei.getPlaca())
                .put("year", vei.getAno())
                .put("model", vei.getModelo())
                .toString();
        return request.doRequestPOST("vehicle", bodyJson);
    }

    //Consultar veículo pela placa
    public static JSONArray consVeiculoPlaca(String placa) {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("vehicle/" + placa));

        return jsonArr;
    }

    //Deletar veículo pela placa
    public static void excluiVeiculoPlaca(String placa) {
        request.doRequestDELETE("vehicle/" + placa);
    }
}

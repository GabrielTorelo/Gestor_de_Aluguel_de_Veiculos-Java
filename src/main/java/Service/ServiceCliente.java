package Service;

import DataBase.BDcliente;
import Exception.AnoNegException;
import Exception.CnhNegException;
import Service.Request.ServiceRequest;
import Model.Cliente;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceCliente {

    private static final ServiceRequest request = ServiceRequest.getInstance();
    private static final BDcliente bdCli = new BDcliente();
    private static Cliente cliente;

    //Lista clientes
    public static BDcliente verClientes() {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("customer"));
        int qtdClientes = jsonArr.length();

        try {
            for (int i = 0; i < qtdClientes; i++) {
                cliente = new Cliente();

                JSONObject jsonObj = jsonArr.getJSONObject(i);

                cliente.setNome(jsonObj.getString("name"));
                cliente.setAno_nasc(jsonObj.getString("birth"));
                cliente.setCnh(jsonObj.getString("driverLicense"));
                cliente.setLogradouro(jsonObj.getString("street"));
                cliente.setCidade(jsonObj.getString("city"));
                cliente.setEstado(jsonObj.getString("district"));
                cliente.setTel(jsonObj.getString("phone"));

                bdCli.cad_Cliente(cliente);
            }
        } catch (AnoNegException ane) {
            System.out.println("Erro ao Inserir Cliente -> Ano de Nascimento!");
            return null;
        } catch (CnhNegException cne) {
            System.out.println("Erro ao Inserir Cliente -> CNH!");
            return null;
        }

        return bdCli;
    }

    //Cria novo cliente
    public static String criaCliente(Cliente cli) throws UnsupportedEncodingException {
        String bodyJson = new JSONObject()
                .put("name", cli.getNome())
                .put("birth", cli.getAno_nasc())
                .put("driverLicense", cli.getCnh())
                .put("street", cli.getLogradouro())
                .put("city", cli.getCidade())
                .put("district", cli.getEstado())
                .put("phone", cli.getTel())
                .toString();
        return request.doRequestPOST("customer", bodyJson);
    }

    //Consultar cliente pela cnh
    public static JSONArray consClienteCNH(String cnh) {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("customer/" + cnh));

        return jsonArr;
    }

    //Deletar cliente pela cnh
    public static void excluiClienteCNH(String cnh) {
        request.doRequestDELETE("customer/" + cnh);
    }
}

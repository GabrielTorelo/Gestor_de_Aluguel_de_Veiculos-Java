package Service;

import Util.Util;
import DataBase.BDpedido;
import Exception.CnhNegException;
import Exception.DiasNegException;
import Exception.PlacaNegException;
import Service.Request.ServiceRequest;
import Model.Veiculo;
import Model.Pedido;
import Model.Cliente;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;

public class ServicePedido {

    private static final ServiceRequest request = ServiceRequest.getInstance();
    private static final BDpedido bdPed = new BDpedido();
    private static Pedido pedido;
    private static Cliente cliente;
    private static Veiculo veiculo;

    //Lista Pedidos
    public static BDpedido verPedidos() {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("order"));
        int qtdPedidos = jsonArr.length();

        try {
            for (int i = 0; i < qtdPedidos; i++) {
                pedido = new Pedido();
                cliente = new Cliente();
                veiculo = new Veiculo();

                JSONObject jsonObj = jsonArr.getJSONObject(i);

                pedido.setId_pedido(jsonObj.getString("id"));
                cliente.setNome(jsonObj.getString("nameCustomer"));
                cliente.setCnh(jsonObj.getString("driverLicense"));
                pedido.setCliente(cliente);
                veiculo.setPlaca(jsonObj.getString("vehiclePlate"));
                pedido.setVeiculo(veiculo);
                pedido.setDataFim(jsonObj.getString("duration"));
                pedido.setDias(Util.duracaoEntreDatas(jsonObj.getString("duration")));
                pedido.setValor(jsonObj.getString("orderValue"));
                pedido.setForma_pag(jsonObj.getString("paymentMethod"));

                bdPed.cad_Ped(pedido);
            }
        } catch (PlacaNegException pe) {
            System.out.println("Erro ao Inserir Pedido -> Placa!");
            return null;
        } catch (DiasNegException dne) {
            System.out.println("Erro ao Inserir Pedido -> Dias!");
            return null;
        } catch (CnhNegException cne) {
            System.out.println("Erro ao Inserir Pedido -> CNH!");
            return null;
        }

        return bdPed;
    }

    //Cria novo pedido
    public static String criaPedido(Pedido ped) throws UnsupportedEncodingException {
        String bodyJson = new JSONObject()
                .put("id", ped.getId_pedido())
                .put("nameCustomer", ped.getCliente().getNome())
                .put("driverLicense", ped.getCliente().getCnh())
                .put("vehiclePlate", ped.getVeiculo().getPlaca())
                .put("duration", ped.getDataFim())
                .put("orderValue", ped.getValor())
                .put("paymentMethod", ped.getForma_pag())
                .toString();
        return request.doRequestPOST("order", bodyJson);
    }

    //Consultar pedido pelo ID
    public static JSONArray consPedidoID(String id) {
        JSONArray jsonArr = new JSONArray(request.doRequestGET("order/" + id));

        return jsonArr;
    }

    //Deletar pedido pelo ID
    public static void excluiPedidoID(String id) {
        request.doRequestDELETE("order/" + id);
    }
}

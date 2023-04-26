package DataBase;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class BDcliente {

    private List<Cliente> bdCli = new ArrayList<Cliente>();

    public List<Cliente> getBdCli() {
        return bdCli;
    }

    public Cliente cad_Cliente(Cliente cliente) {
        if (Cons_ClienteCNH(cliente) == null) {
            bdCli.add(cliente);
            return cliente;
        }
        
        return null;
    }

    //Consultar cliente pela cnh
    public Cliente Cons_ClienteCNH(Cliente cliente) {
        for (int i = 0; i < bdCli.size(); i++) {
            if (cliente.getCnh() == null ? bdCli.get(i).getCnh() == null : cliente.getCnh().equals(bdCli.get(i).getCnh())) {
                return bdCli.get(i);
            }
        }
        
        return null;
    }

    public Cliente Exclui_Cliente(Cliente cliente) {
        cliente = Cons_ClienteCNH(cliente);
        if (cliente != null) {
            bdCli.remove(cliente);
            return null;
        }
        
        return cliente;
    }
}

package DataBase;

import Model.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDpedido {

    private Pedido pedido = new Pedido();
    private List<Pedido> bdPed = new ArrayList<Pedido>();

    public List<Pedido> getBdPed() {
        return bdPed;
    }

    //Cadastrar pedido
    public Pedido cad_Ped(Pedido pedido) {
        bdPed.add(pedido);
        return pedido;
    }

    //Consultar para cadastrar somente veículos disponíveis para pedido
    public int cons_DiasPed(Pedido pedido) {
        int emUso = 0;

        for (int i = 0; i < bdPed.size(); i++) {
            if (pedido.getVeiculo().getPlaca() == null ? bdPed.get(i).getVeiculo().getPlaca() == null : pedido.getVeiculo().getPlaca().equals(bdPed.get(i).getVeiculo().getPlaca())) {
                if (bdPed.get(i).getDias() > 0) {
                    emUso++;
                }
            }
        }

        return emUso;
    }

    //Excluir pedido
    public Pedido exclui_Ped(Pedido pedido) {
        pedido = cons_PedID(pedido.getId_pedido());
        if (pedido != null) {
            bdPed.remove(pedido);

            return null;
        }

        return pedido;
    }

    //Utilizado para excluir pedido e emitir recibo
    public Pedido cons_PedID(String id) {
        for (int i = 0; i < bdPed.size(); i++) {
            if (id == null ? bdPed.get(i).getId_pedido() == null : id.equals(bdPed.get(i).getId_pedido())) {
                return bdPed.get(i);
            }
        }

        return null;
    }

    //Consulta pedido e emite recibo
    public void emitir_recibo() {
        pedido = new Pedido();
        String s = JOptionPane.showInputDialog("Informe o ID do pedido a ser emitido o recibo: ");
        pedido = cons_PedID(s);

        if (s != null || (s == null && ("".equals(s)))) {
            if (pedido != null) {
                for (int i = 0; i < bdPed.size(); i++) {
                    if (s == null ? bdPed.get(i).getId_pedido() == null : s.equals(bdPed.get(i).getId_pedido())) {
                        JOptionPane.showMessageDialog(null, "ID do Pedido: " + bdPed.get(i).getId_pedido() + "\nCliente: " + bdPed.get(i).getCliente().getNome() + "\nValor: " + bdPed.get(i).getValor() + "\nMétodo de pagamento: " + bdPed.get(i).getForma_pag(), "Emissão de recibo", 1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe pedido com esse ID!", "Pedido inexistente", 0);
            }
        }
    }

}

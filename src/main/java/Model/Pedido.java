package Model;

import Exception.DiasNegException;

public class Pedido {

    private Cliente cliente = new Cliente();
    private Veiculo veiculo = new Veiculo();
    private String id_pedido = "";
    private String valor = "";
    private String dataFim = "";
    private int dias = 0;
    private String forma_pag = "";

    //getters e setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) throws DiasNegException {
        if (dias >= 0) {
            this.dias = dias;
        } else {
            throw new DiasNegException();
        }
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(String forma_pag) {
        this.forma_pag = forma_pag;
    }

    public int calcValor(int dias, int valor) {
        return dias * valor;
    }
}

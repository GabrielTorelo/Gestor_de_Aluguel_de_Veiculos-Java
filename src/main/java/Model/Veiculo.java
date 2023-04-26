package Model;

import Exception.PlacaNegException;
import Exception.AnoNegException;
import Exception.PrecoNegException;


public class Veiculo {

    private int preco = 0;
    private String placa = "";
    private String ano = "";
    private String modelo = "";

    //getters e setters
    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) throws PrecoNegException {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new PrecoNegException();
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws PlacaNegException {
        if (placa.length() == 7) {  //placa = 7 caracteres

            this.placa = placa;
        } else {
            throw new PlacaNegException();
        }
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) throws AnoNegException {
        if (ano.length() >= 0) {
            this.ano = ano;
        } else {
            throw new AnoNegException();
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

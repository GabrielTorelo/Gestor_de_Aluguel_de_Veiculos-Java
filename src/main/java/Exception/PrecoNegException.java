package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => preço negativo
public class PrecoNegException extends Exception {

    public void impPrecoNeg() {
        JOptionPane.showMessageDialog(null, "O preço deve ser postivo!", "ERRO de preço", 0);
    }
}

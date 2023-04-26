package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => ano negativo
public class AnoNegException extends Exception {

    public void impAnoNeg() {
        JOptionPane.showMessageDialog(null, "O Ano deve ser positivo!", "ERRO de ano", 0);
    }
}

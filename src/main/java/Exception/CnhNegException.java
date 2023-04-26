package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => CNH negativa
public class CnhNegException extends Exception {

    public void impCnhNeg() {
        JOptionPane.showMessageDialog(null, "A CNH deve ser um número positivo!", "ERRO de CNH", 0);
    }
}

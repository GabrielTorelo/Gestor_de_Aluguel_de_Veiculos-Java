package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => erro ao formatar data
public class DateFormatterNegException extends Exception {

    public void impDateFormatterNeg() {
        JOptionPane.showMessageDialog(null, "Erro ao tentar formatar String para Date!", "ERRO", 0);
    }
}

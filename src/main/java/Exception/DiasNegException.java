package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => dia negativo
public class DiasNegException extends Exception {
	
    public void impDiaNeg() {
        JOptionPane.showMessageDialog(null, "A quantidade de dias deve ser positiva!", "ERRO", 0);
    }
}
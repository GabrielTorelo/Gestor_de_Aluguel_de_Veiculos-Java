package Exception;

import javax.swing.JOptionPane;

//Tratamento de exceções => placa diferente de 7 caracteres
public class PlacaNegException extends Exception {

    public void impPlaca() {
        JOptionPane.showMessageDialog(null, "O campo de Placa deve conter pelo menos 7 caracteres!", "Ocorreu um erro", 0);
    }

}

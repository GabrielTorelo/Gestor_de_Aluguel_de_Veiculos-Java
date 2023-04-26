package DataBase;

import Model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class BDveiculo {

    private Veiculo veiculo = new Veiculo();
    private List<Veiculo> bdVei = new ArrayList<Veiculo>();

    public List<Veiculo> getBdVei() {
        return bdVei;
    }

    public Veiculo cad_Vei(Veiculo veiculo) {
        if (cons_Vei(veiculo) == null) {
            bdVei.add(veiculo);
            return veiculo;
        }
        
        return null;
    }

    //Consultar veiculo pela placa
    public Veiculo cons_Vei(Veiculo veiculo) {
        for (int i = 0; i < bdVei.size(); i++) {
            if (veiculo.getPlaca().equalsIgnoreCase(bdVei.get(i).getPlaca())) {
                return bdVei.get(i); //retorna o objeto que está na posição 'i' do vetor 'bdVei', que é do tipo 'Veiculo'
            }
        }
        
        return null; // retorna objeto vazio do tipo 'Veiculo', caso não ache um veiculo com a placa informada	
    }

    public Veiculo exclui_Vei(Veiculo veiculo) {
        veiculo = cons_Vei(veiculo);
        if (veiculo != null) {
            bdVei.remove(veiculo);
            return null;
        }
        
        return veiculo;
    }
}

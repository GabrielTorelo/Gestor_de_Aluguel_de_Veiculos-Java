package Model;

import Exception.AnoNegException;
import Exception.CnhNegException;


public class Cliente{
    
    private String nome = ""; 
    private String ano_nasc = "";
    private String cnh = "";
    private String logradouro = "";
    private String cidade = "";
    private String estado = "";
    private String tel = "";
    
	
    //getters e setters
    
    public String getCnh() {
        return cnh;
    }
	
    public void setCnh(String cnh) throws CnhNegException {
		
    	if(cnh.length() > 0){
    		
            this.cnh = cnh;
    	}
	else{
            throw new CnhNegException(); 
	}	
    }
	
    public String getNome() {
	return nome;
    }
    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(String ano_nasc) throws AnoNegException {
        if(ano_nasc.length() > 0){
            this.ano_nasc = ano_nasc;
        }
        else{
            throw new AnoNegException();
        }
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
		
}
    
    
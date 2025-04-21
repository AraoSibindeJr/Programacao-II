package FichasDeExercicios.Ficha02.Exercicio01.Domain;

public class CamaroteInferior extends VIP{
    // Atributos especificos
    private String localBilhete;
    CamaroteInferior(String localBilhete, double valorVIP, double valorAdd){
        super(valorAdd, valorVIP);
    }

    String getLocalBilhete(){
        return localBilhete;
    }
    void setLocalBilhete(String localBilhete){
        this.localBilhete = localBilhete;
    }

    public String toString(){
        return "Localizacao do Bilhete: "+ getLocalBilhete();
    }
}

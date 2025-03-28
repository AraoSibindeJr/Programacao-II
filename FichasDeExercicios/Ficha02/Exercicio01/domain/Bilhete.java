package FichasDeExercicios.Ficha02.Exercicio01.domain;

public class Bilhete {
    // Atributos usados
    private double valorBilhete;

    public void setValorBilhete(double valorBilhete) {
        this.valorBilhete = valorBilhete;
    }
    public double getValorBilhete(){
        return valorBilhete;
    }

    public void imprimeValor(){
        System.out.println(" Valor do bilhete: " + getValorBilhete());
    }

}

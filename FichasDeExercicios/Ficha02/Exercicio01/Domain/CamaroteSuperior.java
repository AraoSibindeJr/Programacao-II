package FichasDeExercicios.Ficha02.Exercicio01.Domain;

public class CamaroteSuperior extends VIP{
    private double valorBilhete;
    CamaroteSuperior(double valorAd, double valorVIP, double valorBilhete){
        super(valorAd, valorVIP);
        valorBilhete = valorVIP - valorAd;
    }

    double valorBilhete(double valorBilhete){
        return valorBilhete;
    }

}

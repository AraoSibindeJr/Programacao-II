package FichasDeExercicios.Ficha02.Exercicio01.Domain;

public class VIP extends  Bilhete{
    // Atributos especificos da classe
    private double valorAdd;
    private double valorVIP;

    VIP(double valorAdd, double valor){
        super(valor);
        this.valorAdd = valorAdd;
        valorVIP = valor + valorAdd;
        //  a = b + c;
        /*
            b + c = a
            b = a - c
        * */
    }
}

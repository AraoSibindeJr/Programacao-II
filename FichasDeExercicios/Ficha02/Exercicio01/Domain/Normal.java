package FichasDeExercicios.Ficha02.Exercicio01.Domain;

public class Normal extends Bilhete{
    Normal(double valor) {
        super(valor);
    }

    public void imprimirBilheteNormal(){
        System.out.println("Bilhete Normal");
    }
}

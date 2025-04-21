package FichasDeExercicios.Ficha02.Exercicio02.Domain;

public class Velho extends Imovel{
    // Atributos especificos
    private double desconto;

    public double getDesconto() {
        return desconto;
    }
    public void getDesconto(double precoAdd){
        this.desconto =  precoAdd;
    }
    public Velho(double desconto, double preco, String endereco){
        super(endereco, preco);
        preco = preco - desconto;
        System.out.println("O desconto e de: " + desconto);
    }
}

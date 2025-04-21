package FichasDeExercicios.Ficha02.Exercicio02.Domain;

public class Novo extends Imovel{
    // Atributos especificos

    private double precoAdd;

    public double getPrecoAdd() {
        return precoAdd;
    }
    public void setPrecoAdd(double precoAdd){
        this.precoAdd =  precoAdd;
    }

    public Novo(double precoAdd, double preco, String endereco){
        super(endereco, preco);
        this.precoAdd = precoAdd;
        precoAdd = precoAdd + preco;
        System.out.println(" Valor adicional: " + getPrecoAdd());
    }
}

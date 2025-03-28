package FichasDeExercicios.Ficha02.Exercicio01.domain;

public class VIP extends Bilhete{
    private double valorAdd;


    public void setValorAdd(double valorAdd){
        this.valorAdd = valorAdd;
    }
    public double getValorAdd(){
        return valorAdd;
    }

    public void bilheteVIP(){
        System.out.println(" ===> BEM-VINDO A CLASSE VIP <=== ");
        double r = valorAdd + getValorBilhete();
        System.out.println(" Valor do Bilhete VIP: "+ r);
        System.out.println(" A Classe VIP custa: " + getValorAdd() + "MZN");
    }
}

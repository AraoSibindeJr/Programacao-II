package FichasDeExercicios.Ficha07.Exercicio02.domain;

public class Cachorro extends Animal {
    // Atributos especificos
    private String nome;
    // Construtor
    public Cachorro(int pernas, String nome){
        super(pernas);
        this.nome = nome;
    }
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Metodos
    public void brinca(){
        System.out.println("O cao" + getNome() + " brinca");
    }
    public void come(){
        System.out.println("O cao" + getNome() + " come");
    }
}

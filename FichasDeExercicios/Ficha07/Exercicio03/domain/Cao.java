package FichasDeExercicios.Ficha07.Exercicio03.domain;

public class Cao implements Animal {
    //Atributo especificos da classe
    private String nome;
    // Metodo Construtor
    public Cao(String nome){
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cao faz: AU, AU!!");
    }
}

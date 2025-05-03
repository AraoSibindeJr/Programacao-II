package FichasDeExercicios.Ficha07.Exercicio01.domain;

public abstract  class RoboAbstrato {
    // Criacao dos atributos
    protected int graus;
    // Criacao do Construtor
    public RoboAbstrato(int graus){
        this.graus = graus;
    }
    // Instaciar o metodo abstrato
    public abstract void mudarDirrecao(int graus);
}

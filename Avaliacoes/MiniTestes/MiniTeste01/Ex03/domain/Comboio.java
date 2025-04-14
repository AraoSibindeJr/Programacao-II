package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

public class Comboio extends Transporte {
    // Atributos especificos
    private int nrVagoes;
    // Criar construtor com atributos da classe Transporte e atributo especifico da classe
    public Comboio(String cor, String marca,String modelo, long velMax, String ref, int nrVagoes){
        super(cor, marca, modelo, velMax, ref);
        // Inicializar apenas as variaveis que precisamos usar:
        this.marca = marca;
        this.modelo = modelo;
        this.nrVagoes = nrVagoes;
        this.ref= ref;
        this.cor = cor;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Comboio:" +
                "Marca => " + marca + " "+
                "Modelo => " + modelo + " "+
                " Numero de Vagoes => " + nrVagoes + " "+
                "Cor => " + cor + " "+   "Referencia => " + ref
                ;
    }
}

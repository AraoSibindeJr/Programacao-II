package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

public class Transporte {
    /*
        =>  Classes e seus atributos
            * Carro (matricula, anoFabrico, estado, nrAcento)
            * Comboio (nrVagoes)
            * Bicicleta (nrRodas)
        => Atributos Comuns

    */
    protected String cor;
    protected String marca;
    protected String modelo;
    protected long velMax;
    protected String ref;

    // Metodo construtor
    public Transporte(String cor, String marca,String modelo, long velMax, String ref){
        this.cor = cor;
        this.velMax = velMax;
        this.marca = marca;
        this.modelo = modelo;
        this.ref = ref;
    }
}

package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

public class Bicicleta extends Transporte {
    // Atributos especificos da classe:
    private short nrRodas;

    // Construtor com atributos da classe transporte e o atributo especifico desta classe
    public Bicicleta(String cor, String marca,String modelo, long velMax, String ref, short nrRodas){
        super(cor, marca, modelo, velMax, ref);
        // Inicializar apenas as variaveis que precisamos usar:
        this.marca = marca;
        this.modelo = modelo;
        this.nrRodas = nrRodas;
        this.ref= ref;
        this.cor = cor;
    }

    // Criar o metodo para a saida de dados
    @Override
    public String toString() {
        return "Bicicleta:" +
                "Marca => " + marca + " "+
                "Modelo => " + modelo + " "+
                " Numero de Rodas => " + nrRodas + " "+
                "Cor => " + cor + " "+   "Referencia => " + ref
                ;
    }
}

package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

public class Carro extends Transporte {
        private String matricula;
        private int anoFabrico;
        private String estado;
        private int nrAcento;


        // Atribuicao de dados atraves do metodo construtor

        public Carro(String cor, String marca, String modelo, long velMax, String ref, String matricula, int anoFabrico, String estado, int nrAcento) {
            super(cor, marca, modelo, velMax, ref);
            this.matricula = matricula;
            this.anoFabrico = anoFabrico;
            this.estado = estado;
            this.nrAcento = nrAcento;
        }

        // Metodo para saida de dados
    @Override
    public String toString() {
        return "Carro:" +
                "Matricula => " + matricula + " "+
                "Ano de Fabrico => " + anoFabrico + " "+
                "Estado => " + estado + " "+
                "Numero de Acentos =>" + nrAcento
                ;
    }
}

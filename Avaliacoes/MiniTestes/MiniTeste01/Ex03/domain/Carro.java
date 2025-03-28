package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

    public class Carro extends Transporte{
        private String matricula;
        private int anoFabrico;
        private String estado;
        private int nrAcento;



        public Carro(String cor, String marca, String modelo, long velMax, String ref) {
            super(cor, marca, modelo, velMax, ref);
        }
    }

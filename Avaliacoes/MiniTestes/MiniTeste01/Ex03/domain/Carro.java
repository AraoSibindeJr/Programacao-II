package Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain;

public class Carro extends Transporte {
        private String matricula;
        private int anoFabrico;
        private String estado;
        private int nrAcento;


        // Construtor de Carro

        public Carro(String cor, String marca, String modelo, long velMax, String ref, String matricula, int anoFabrico, String estado, int nrAcento) {
            super(cor, marca, modelo, velMax, ref);
            this.matricula = matricula;
            this.anoFabrico = anoFabrico;
            this.estado = estado;
            this.nrAcento = nrAcento;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNrAcento() {
        return nrAcento;
    }

    public void setNrAcento(int nrAcento) {
        this.nrAcento = nrAcento;
    }
    // Metodo para transformar o objecto em "String"
    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", anoFabrico=" + anoFabrico +
                ", estado='" + estado + '\'' +
                ", nrAcento=" + nrAcento +
                '}';
    }
}

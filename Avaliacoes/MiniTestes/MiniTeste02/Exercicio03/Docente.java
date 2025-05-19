package Avaliacoes.MiniTestes.MiniTeste02.Exercicio03;

public class Docente extends Funcionario{
    byte horas;
    public Docente(String cod, String nome, String datNasc, char cat,int nrDep, double sal, byte horas ){
        super(cod, nome,datNasc, sal,cat,nrDep);
        this.horas = horas;
    }


    @Override
    public double calcularSalario(char cat, int nrDep, double sal) {
        return 0;
    }

    @Override
    public void exibirInfo() {

    }
}

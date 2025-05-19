package Avaliacoes.MiniTestes.MiniTeste02.Exercicio03;

public abstract  class Funcionario {
    String cod;
    String datNasc;
    String nome;
    char cat;
    double sal;
    int nrDep;

    public Funcionario(String cod, String nome, String datNasc, double sal, char cat, int nrDep) {}
    public Funcionario(String cod, String datNasc){
        this.nrDep = nrDep;
        this.cat = cat;
        this.nome= nome;
        this.datNasc=datNasc;
        this.cod=cod;
        this.sal=sal;
    }



    public abstract double calcularSalario(char cat, int nrDep, double sal);
    public abstract void exibirInfo();
}

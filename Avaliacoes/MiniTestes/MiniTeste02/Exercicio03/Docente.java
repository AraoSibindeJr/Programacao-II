package Avaliacoes.MiniTestes.MiniTeste02.Exercicio03;

public class Docente extends Funcionario{
    byte horas;
    public Docente(String cod, String nome, String datNasc, char cat,int nrDep, double sal, byte horas ){
        super(cod, nome,datNasc, sal,cat,nrDep);
        this.horas = horas;
    }


    @Override
    public double calcularSalario(char cat, int nrDep, double sal) {
        if(horas <= 0) {
            // Docente a tempo inteiro
            switch (cat) {
                case 'A':
                    sal = 15200;
                    break;
                case 'B':
                    sal = 10500;
                    break;
                default:
                    sal = 0;
                    break;
            }
        }else{
            // Docente a tempo parcial
            switch (cat){
                case 'A':
                    sal = 750*horas;
                    break;
                case 'B':
                    sal = 470*horas;
                    break;
                default:
                    sal = 0;
                    break;
            }
        }
        if (nrDep > 5) {
            return sal + (sal * 0.05);
        }else{
            return 0;
        }
    }

    @Override
    public void exibirInfo() {

    }
}

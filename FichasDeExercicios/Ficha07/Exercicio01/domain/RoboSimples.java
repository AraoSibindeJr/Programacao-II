package FichasDeExercicios.Ficha07.Exercicio01.domain;

public class RoboSimples extends RoboAbstrato{
    // Criar atributos especificos da classe
    // Criar construtor
    public RoboSimples(int graus){
        super(graus);
    }
    // Codificar o metodo mudarDirrecao
    @Override
    public void mudarDirrecao(int graus){
        if(graus > 45 && graus < 135){
            System.out.println("A Posicao do Robo e de 90 Graus");
        }else if(graus > 135 && graus < 225){
            System.out.println("A Posicao do Robo e de 180 Graus");
        }else if(graus > 225 && graus < 315){
            System.out.println("A Posicao do Robo e de 270 Graus");
        }else{
            System.out.println("A Posicao do Robo e de 0 Graus");;
        }
    }
}

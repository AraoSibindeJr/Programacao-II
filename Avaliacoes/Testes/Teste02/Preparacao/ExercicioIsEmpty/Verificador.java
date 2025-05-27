package Avaliacoes.Testes.Teste02.Preparacao.ExercicioIsEmpty;

import java.util.Vector;

public class Verificador {
    /* Passo a passo:
    * 1 - Criar uma classe que vai hospedar dois metodos;
    * 2 - Criar o metodo responsavel por verificar se certo vector esta ou nao vazio;
    * 3 - Criar o metodo main responsavel por criar os vectores e fazer a sair de dados
    * */

    public static void verificarVector(Vector<?> vector){
        if(vector.isEmpty()){
            System.out.println("O vector esta vazio");
        }else {
            System.out.println("O vector tem conteudo");
        }
    }

    public static void main(String[] args) {
        Vector<String> vectorVazio = new Vector<>();
        Vector<String> vectorConteudo = new Vector<>();
        vectorConteudo.add("Hello");
        vectorConteudo.add("Arao");
        verificarVector(vectorVazio);
        verificarVector(vectorConteudo);
    }
}

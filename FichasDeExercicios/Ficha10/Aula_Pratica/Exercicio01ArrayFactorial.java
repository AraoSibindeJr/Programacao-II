package FichasDeExercicios.Ficha10.Aula_Pratica;
/*
* Criar um array do tipo Double com 150 posicoes, Calcular factorial de cada posicao
* e guardar o valor no respectivo elemento correspondente.*/
public class Exercicio01ArrayFactorial {
    public static void main(String[] args) {
        // Declaracao do array
        double [] factoriais = new double[150];
        // Preencher o array com os valores factoriais
        for(int i=0; i<factoriais.length;i++){
            factoriais[i] = calcularFactorial(i);// Mudamos o parametro do metodo
        }
        // Saida de Dados: Alguns valores
        System.out.println("Factorial de 0: " + factoriais[0]);
        System.out.println("Factorial de 1: " + factoriais[1]);
        System.out.println("Factorial de 2: " + factoriais[2]);
        System.out.println("Factorial de 5: " + factoriais[5]);
    }

    // Metodo para Calcular Factorial de um Numero
    public static double calcularFactorial(int n){
        if (n == 0){
            return 0;
        }

        double resultado = 1;
        for(int i=1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
}

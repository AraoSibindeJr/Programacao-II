package FichasDeExercicios.Ficha10.Aula_Teorica;
import java.util.Scanner;
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // Tamanho do vetor
        int v[] = new int[n];
        int i;

        // Entrada de dados
        for(i =0; i<n; i++){
            System.out.println("Informe o " + (i+1) + " valor de " + n + ":");
            v[i] = sc.nextInt();
        }

        //Processamento: Somar todos valores, definir o maior e o menor
        int maior = v[0],  menor = v[0],  totSum = 0;
        for(i = 0; i<n; i++){
            totSum += v[i]; // Somar Todos valores do vetor
            if(menor > v[i] ){
                menor = v[i];
            }
            if(maior < v[i]){
                maior = v[i];
            }
        }

        // Saida de dados
        System.out.println(" <===> Saida de Dados <===> ");
        for(i=0; i<n; i++){
            if(v[i] == menor){
                System.out.println("v"+"["+i+"]"  + " = " + v[i] + "<---- Menor valor "  );
            }else if(v[i] == maior){
                System.out.println("v"+"["+i+"]"  + " = " + v[i] + "<---- Maior valor "  );
            }else{
                System.out.println("v"+"["+i+"]"  + " = " + v[i]);
            }
        }
        System.out.println("Soma = " + totSum);
    }
}

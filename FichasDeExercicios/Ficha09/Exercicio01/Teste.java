package FichasDeExercicios.Ficha09.Exercicio01;
 import java.util.Scanner;
public class Teste {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Nome Proprio: ");
        String nP = sc.next();
        System.out.println("Insira o Nome do Meio: ");
        String nM = sc.next();
        System.out.println("Insira o Nome da Familia: ");
        String nF = sc.next();
        rubrica(nP, nM, nF);

    }

    public static void rubrica(String nP, String nM, String nF){
        char nomeProprio = Character.toLowerCase(nP.charAt(0));
        char nomeMeio = Character.toLowerCase(nM.charAt(0));
        char nomeFamilia = Character.toLowerCase(nF.charAt(0));
        System.out.println(nomeProprio + nomeMeio + nomeFamilia);
    }
}

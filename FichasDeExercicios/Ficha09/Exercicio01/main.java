package FichasDeExercicios.Ficha09.Exercicio01;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Insira Nome Proprio: ");
        String nP = sc.next();
        System.out.println(" Insira Nome do Meio: ");
        String nM = sc.next();
        System.out.println(" Insira Nome da Familia: ");
        String nF = sc.next();
        System.out.println(" ==============  ");
        System.out.println(rubrica(nP,nM,nF).toLowerCase());
        System.out.println(assinatura(nP,nM,nF));
    }

    public static String rubrica(String nP, String nM, String nF){
        return "Rubrica: "  + nP.charAt(0) +  nM.charAt(0) + nF.charAt(0) ;
    }

    public static String assinatura(String nP, String nM, String nF){
        return "Assinatura: " + nP.charAt(0) + "." + nM.charAt(0) +"."+ nF ;
    }
}

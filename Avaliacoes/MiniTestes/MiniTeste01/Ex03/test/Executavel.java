package Avaliacoes.MiniTestes.MiniTeste01.Ex03.test;

import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Carro;
import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Transporte;

public class Executavel {
    public static void main(String[] args) {
        Transporte C1 = new Carro("Verde","BMW","CX50",250,"JADG","ACW964MC",2023,"BOM",10012);
        Transporte C2 = new Carro("Vermelho","Ferrari","M8",350,"JADQ","ARW964MC",2024,"MAU",1003);
        System.out.println(" ==> Carros <== ");
        System.out.println(" => Carro 01: ");
        System.out.println(" ==> " + C1);
        System.out.println(" => Carro 02: ");
        System.out.println(" ==> " + C2);
    }
}

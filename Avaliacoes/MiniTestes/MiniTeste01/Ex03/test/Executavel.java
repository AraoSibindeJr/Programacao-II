package Avaliacoes.MiniTestes.MiniTeste01.Ex03.test;

import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Bicicleta;
import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Carro;
import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Comboio;
import Avaliacoes.MiniTestes.MiniTeste01.Ex03.domain.Transporte;

public class Executavel {
    public static void main(String[] args) {
        Transporte C1 = new Carro("Verde","BMW","CX50",250,"JADG","ACW964MC",2023,"BOM",2);
        Transporte C2 = new Carro("Vermelho","Ferrari","M8",350,"JADQ","ARW964MC",2024,"MAU",2);
        Transporte B1 = new Bicicleta("Preta", "BMX", "R98",25L,"100", (short) 2);
        Transporte B2 = new Bicicleta("Branca", "TremBala", "R58",30L,"101", (short) 2);
        Transporte Comb1 = new Comboio("Verde", "Trela","SAS", 1500L,"sla",15);
        Transporte Comb2 = new Comboio("Rosa", "TrelaS","SASPrem", 1500L,"la",25);
        System.out.println(" ==> Carros <== ");
        System.out.println(" => Carro 01: ");
        System.out.println(" ==> " + C1);
        System.out.println(" => Carro 02: ");
        System.out.println(" ==> " + C2);
        System.out.println(" ==> Bicicletas <== ");
        System.out.println(" => Bicicletas 01: ");
        System.out.println(" ==> " + B1);
        System.out.println(" => Bicicletas 02: ");
        System.out.println(" ==> " + B2);
        System.out.println(" ==> Comboios <== ");
        System.out.println(" => Comboio 01: ");
        System.out.println(" ==> " + Comb1);
        System.out.println(" => Comboio 02: ");
        System.out.println(" ==> " + Comb1);
    }
}

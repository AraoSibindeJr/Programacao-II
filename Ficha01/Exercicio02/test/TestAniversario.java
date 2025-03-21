package Ficha01.Exercicio02.test;

import Ficha01.Exercicio02.domain.Aniversario;

public class TestAniversario {
    public static void main(String[] args) {
        Aniversario aniversario = new Aniversario(); //Instancia de uma classe (Objcto)
        aniversario.setAge(19);
        aniversario.setName("Arao Sibinde");
        aniversario.aniversarios();
        aniversario.status();
    }
}

package Ficha01.Exercicio04.test;

import Ficha01.Exercicio04.domain.Conta;

public class TestConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setSaldo(0);
        conta1.setDeposito(500);
        conta1.deposito();
        conta1.setSaque(200);
        conta1.sacar();
        conta1.rendimento();
    }
}

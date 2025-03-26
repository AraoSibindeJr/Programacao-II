package FichasDeExercicios.Ficha01.Exercicio03.test;

import FichasDeExercicios.Ficha01.Exercicio03.domain.PortaoAutomatico;

public class TestePortaoAutomatico {
    public static void main(String[] args) {
        PortaoAutomatico porta = new PortaoAutomatico();
        porta.fecharPorta();
        porta.setAltura(1.20);
        porta.setLargura(0.90);
        porta.statusDaPorta();
    }
}

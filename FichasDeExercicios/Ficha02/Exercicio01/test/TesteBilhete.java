package FichasDeExercicios.Ficha02.Exercicio01.test;

import FichasDeExercicios.Ficha02.Exercicio01.domain.Bilhete;
import FichasDeExercicios.Ficha02.Exercicio01.domain.VIP;

public class TesteBilhete {
    public static void main(String[] args) {
        Bilhete bilhete = new Bilhete();
        bilhete.setValorBilhete(300);
        bilhete.imprimeValor();
        VIP vip = new VIP();
        vip.setValorAdd(20);
        vip.bilheteVIP();

    }
}

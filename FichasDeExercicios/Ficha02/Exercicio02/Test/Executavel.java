package FichasDeExercicios.Ficha02.Exercicio02.Test;

import FichasDeExercicios.Ficha02.Exercicio02.Domain.Imovel;
import FichasDeExercicios.Ficha02.Exercicio02.Domain.Novo;
import FichasDeExercicios.Ficha02.Exercicio02.Domain.Velho;

public class Executavel {
    public static void main(String[] args) {
        // Instanciar Objecto
        Imovel I1 = new Novo(50,300,"pix");
        Imovel I2 = new Velho(50,500,"PIX");
    }
}

package FichasDeExercicios.Ficha02.Exercicio01.Domain;

public class Bilhete {
    // Atributos especificos desta classe
    protected double valor;

    public Bilhete(double valor) {
    }

    // Criar metodos get e set, para garantir o Encapsulamento
    double getValor(double valor){
        return valor;
    }
    void setValor(double valor){
        this.valor = valor;
    }

    // Metodos do programa
    double imprimirValor(double valor){
        return valor;
    }

}


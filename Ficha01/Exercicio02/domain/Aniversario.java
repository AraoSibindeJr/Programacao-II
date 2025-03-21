package Ficha01.Exercicio02.domain;

public class Aniversario {

    /*  Exercício 2: Aniversariante
     *   Crie uma Pessoa, com os atributos id, nome e idade. Faça alguns aniversários
     *  (aumentando a idade em +1 ano), e no final imprima o seu nome, idade e quantidade
     *   de aniversários feitos.
     */
    // Declaracao dos atributos
    private String id;
    private String name;
    private int age;

    // Criacao dos 'Getters' e 'Setters'
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    int previousAge;
    public void setAge(int age) {
        this.age = age;
        previousAge = age;
    }
    int cont = 0;
    public void aniversarios() {
        while(cont<4) {
            age += 1;
            cont++;
        }
    }
    public void status() {
        System.out.println("Informacoes Da Pessoa:");
        System.out.println("Nome: " + getName());
        System.out.println("Idade antes: " + previousAge);
        System.out.println("Idade atual: "+ getAge());
        System.out.println("Aniversarios Completados: " + cont);
    }
}

package Avaliacoes.TrabalhoPratico;

import java.io.Serializable;

public class Produto implements Serializable {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeStock;
    private static final double IVA = 0.17; // 17% de IVA

    public Produto(String codigo, String nome, double preco, int quantidadeStock) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeStock = quantidadeStock;
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidadeStock() { return quantidadeStock; }
    public void setQuantidadeStock(int quantidadeStock) {
        if(quantidadeStock >= 0) {
            this.quantidadeStock = quantidadeStock;
        }
    }
    public double getPrecoComIVA() { return preco * (1 + IVA); }

    public void adicionarStock(int quantidade) {
        if(quantidade > 0) {
            this.quantidadeStock += quantidade;
        }
    }

    public boolean removerStock(int quantidade) {
        if(quantidade > 0 && this.quantidadeStock >= quantidade) {
            this.quantidadeStock -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produto [Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco +
                ", Stock: " + quantidadeStock + "]";
    }
}
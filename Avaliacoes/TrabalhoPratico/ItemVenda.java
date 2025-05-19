package Avaliacoes.TrabalhoPratico;

import java.io.Serializable;

public class ItemVenda implements Serializable {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPrecoComIVA();
    }

    // Getters
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
    public double getSubtotal() { return precoUnitario * quantidade; }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " (" + precoUnitario + " cada) = " + getSubtotal();
    }
}
package Avaliacoes.TrabalhoPratico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda implements Serializable {
    private String numeroVenda;
    private Cliente cliente;
    private Date data;
    private List<ItemVenda> itens;
    private double total;

    public Venda(String numeroVenda, Cliente cliente) {
        this.numeroVenda = numeroVenda;
        this.cliente = cliente;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        total += item.getSubtotal();
    }

    // Getters
    public String getNumeroVenda() { return numeroVenda; }
    public Cliente getCliente() { return cliente; }
    public Date getData() { return data; }
    public List<ItemVenda> getItens() { return itens; }
    public double getTotal() { return total; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda #").append(numeroVenda).append("\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Data: ").append(data).append("\n");
        sb.append("Itens:\n");
        for(ItemVenda item : itens) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
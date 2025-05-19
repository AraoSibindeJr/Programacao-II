package Avaliacoes.TrabalhoPratico;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente(String id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Cliente [ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email + "]";
    }
}
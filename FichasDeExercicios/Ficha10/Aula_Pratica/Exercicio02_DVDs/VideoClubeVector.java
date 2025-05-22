package FichasDeExercicios.Ficha10.Aula_Pratica.Exercicio02_DVDs;

import java.util.Vector;

public class VideoClubeVector {
    private Vector<Filme> prateleira = new Vector<>();

    // Método para listar todos os filmes
    public void listar() {
        if (prateleira.isEmpty()) {
            System.out.println("Prateleira vazia!");
            return;
        }

        System.out.println("=== Lista de Filmes ===");
        for (Filme filme : prateleira) {
            System.out.println("ID: " + filme.id);
            System.out.println("Nome: " + filme.nome);
            System.out.println("Gênero: " + filme.genero);
            System.out.println("Ano de Lançamento: " + filme.anoLancamento);
            System.out.println("---------------------");
        }
    }

    // Método para atualizar o gênero de um filme
    public void atualizarGenero(int id, String novoGenero) {
        for (Filme filme : prateleira) {
            if (filme.id == id) {
                filme.genero = novoGenero;
                System.out.println("Gênero atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado com o ID: " + id);
    }

    // Método para remover um filme
    public void remover(int id) {
        for (int i = 0; i < prateleira.size(); i++) {
            if (prateleira.get(i).id == id) {
                prateleira.remove(i);
                System.out.println("Filme removido com sucesso!");
                return;
            }
        }
        System.out.println("Filme não encontrado com o ID: " + id);
    }

    // Método para inserir um novo filme
    public void inserir(int id, String nome, String genero, int anoLancamento) {
        // Verificar se o ID já existe
        for (Filme filme : prateleira) {
            if (filme.id == id) {
                System.out.println("Já existe um filme com este ID!");
                return;
            }
        }

        Filme novoFilme = new Filme(id, nome, genero, anoLancamento);
        prateleira.add(novoFilme);
        System.out.println("Filme adicionado com sucesso!");
    }

    // Método para obter o nome do filme pelo índice
    public String getNomePorIndice(int indice) {
        if (indice >= 0 && indice < prateleira.size()) {
            return prateleira.get(indice).nome;
        }
        return "Índice inválido!";
    }

    // Método para listar filmes por gênero
    public void listarPorGenero(String genero) {
        System.out.println("=== Filmes do Gênero: " + genero + " ===");
        boolean encontrado = false;

        for (Filme filme : prateleira) {
            if (filme.genero.equalsIgnoreCase(genero)) {
                System.out.println("ID: " + filme.id + " - Nome: " + filme.nome +
                        " (" + filme.anoLancamento + ")");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum filme encontrado com este gênero.");
        }
    }

    // Método para listar filmes por ano de lançamento
    public void listarPorAno(int ano) {
        System.out.println("=== Filmes Lançados em " + ano + " ===");
        boolean encontrado = false;

        for (Filme filme : prateleira) {
            if (filme.anoLancamento == ano) {
                System.out.println("ID: " + filme.id + " - Nome: " + filme.nome +
                        " (" + filme.genero + ")");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum filme encontrado lançado neste ano.");
        }
    }


}

package FichasDeExercicios.Ficha10.Aula_Pratica.Exercicio02_DVDs;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        VideoClubeVector locadora = new VideoClubeVector();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu VideoClube ===");
            System.out.println("1. Listar todos os filmes");
            System.out.println("2. Atualizar gênero de um filme");
            System.out.println("3. Remover um filme");
            System.out.println("4. Inserir novo filme");
            System.out.println("5. Buscar nome do filme por índice");
            System.out.println("6. Listar filmes por gênero");
            System.out.println("7. Listar filmes por ano de lançamento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    locadora.listar();
                    break;
                case 2:
                    System.out.print("Digite o ID do filme: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo gênero: ");
                    String novoGenero = scanner.nextLine();
                    locadora.atualizarGenero(idAtualizar, novoGenero);
                    break;
                case 3:
                    System.out.print("Digite o ID do filme a ser removido: ");
                    int idRemover = scanner.nextInt();
                    locadora.remover(idRemover);
                    break;
                case 4:
                    System.out.print("Digite o ID do novo filme: ");
                    int novoId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do filme: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String genero = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int ano = scanner.nextInt();
                    locadora.inserir(novoId, novoNome, genero, ano);
                    break;
                case 5:
                    System.out.print("Digite o índice do filme: ");
                    int indice = scanner.nextInt();
                    System.out.println("Nome do filme: " + locadora.getNomePorIndice(indice));
                    break;
                case 6:
                    System.out.print("Digite o gênero para filtrar: ");
                    String generoFiltro = scanner.nextLine();
                    locadora.listarPorGenero(generoFiltro);
                    break;
                case 7:
                    System.out.print("Digite o ano para filtrar: ");
                    int anoFiltro = scanner.nextInt();
                    locadora.listarPorAno(anoFiltro);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}


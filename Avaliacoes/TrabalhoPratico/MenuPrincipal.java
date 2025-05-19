import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;
    private final ClienteService clienteService;
    private ProdutoService produtoService;
    private VendaService vendaService;
    private RelatorioService relatorioService;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
        this.clienteService = new ClienteService();
        this.produtoService = new ProdutoService();
        this.vendaService = new VendaService();
        this.relatorioService = new RelatorioService();
        inicializarDadosTeste();
    }

    private void inicializarDadosTeste() {
        // Adicionar 10 produtos para teste
        if(produtoService.listarProdutos().isEmpty()) {
            produtoService.criarProduto("P001", "Arroz", 1.50, 20);
            produtoService.criarProduto("P002", "Feijão", 2.00, 15);
            // ... adicionar mais 8 produtos
        }
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Clientes");
            System.out.println("2. Produtos");
            System.out.println("3. Inventários");
            System.out.println("4. Vendas");
            System.out.println("5. Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch(opcao) {
                case 1:
                    exibirMenuClientes();
                    break;
                case 2:
                    exibirMenuProdutos();
                    break;
                case 3:
                    exibirMenuInventarios();
                    break;
                case 4:
                    exibirMenuVendas();
                    break;
                case 5:
                    exibirMenuRelatorios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    private void exibirMenuClientes() {
        int opcao;
        do {
            System.out.println("\n=== MENU CLIENTES ===");
            System.out.println("1. Criar Cliente");
            System.out.println("2. Atualizar Cliente");
            System.out.println("3. Remover Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    criarCliente();
                    break;
                case 2:
                    atualizarCliente();
                    break;
                case 3:
                    removerCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    private void criarCliente() {
        System.out.println("\n--- Criar Cliente ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        clienteService.criarCliente(id, nome, telefone, email);
        System.out.println("Cliente criado com sucesso!");
    }

    // Implementar métodos similares para atualizar, remover e listar clientes
    // Implementar menus e métodos para Produtos, Vendas, Inventários e Relatórios
}
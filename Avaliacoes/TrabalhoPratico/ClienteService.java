package Avaliacoes.TrabalhoPratico;

import java.util.List;

public class ClienteService {
    private ClienteRepository repository;

    public ClienteService() {
        this.repository = new ClienteRepository();
    }

    public void criarCliente(String id, String nome, String telefone, String email) {
        Cliente novoCliente = new Cliente(id, nome, telefone, email);
        repository.salvar(novoCliente);
    }

    public Cliente buscarCliente(String id) {
        return repository.buscarPorId(id);
    }

    public List<Cliente> listarClientes() {
        return repository.listarTodos();
    }

    public void atualizarCliente(Cliente cliente) {
        repository.atualizar(cliente);
    }

    public void removerCliente(String id) {
        repository.remover(id);
    }
}
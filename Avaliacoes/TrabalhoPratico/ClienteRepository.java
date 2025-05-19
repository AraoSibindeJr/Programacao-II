import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repository<Cliente> {
    private List<Cliente> clientes;
    private FileManager fileManager;
    private static final String FILE_NAME = "clientes.dat";

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
        this.fileManager = new FileManager();
        carregarDados();
    }

    private void carregarDados() {
        Object data = fileManager.lerObjeto(FILE_NAME);
        if(data != null) {
            clientes = (List<Cliente>) data;
        }
    }

    private void salvarDados() {
        fileManager.salvarObjeto(FILE_NAME, clientes);
    }

    @Override
    public void salvar(Cliente cliente) {
        clientes.add(cliente);
        salvarDados();
    }

    @Override
    public Cliente buscarPorId(String id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void atualizar(Cliente cliente) {
        Cliente existente = buscarPorId(cliente.getId());
        if(existente != null) {
            existente.setNome(cliente.getNome());
            existente.setTelefone(cliente.getTelefone());
            existente.setEmail(cliente.getEmail());
            salvarDados();
        }
    }

    @Override
    public void remover(String id) {
        clientes.removeIf(c -> c.getId().equals(id));
        salvarDados();
    }
}
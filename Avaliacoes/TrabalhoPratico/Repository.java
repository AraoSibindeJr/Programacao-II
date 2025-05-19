package Avaliacoes.TrabalhoPratico;

import java.util.List;

public interface Repository<T> {
    void salvar(T objeto);
    T buscarPorId(String id);
    List<T> listarTodos();
    void atualizar(T objeto);
    void remover(String id);
}
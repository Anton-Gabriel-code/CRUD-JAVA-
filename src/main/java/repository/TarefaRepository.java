package repository;

import model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    // CRIAR
    public Tarefa salvar(Tarefa tarefa) {
        tarefa.setId(proximoId++);
        tarefas.add(tarefa);
        return tarefa;
    }

    // LER
    public List<Tarefa> listar() {
        return tarefas;
    }

    public Tarefa buscarPorId(int id) {
        return tarefas.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ATUALIZAR
    public boolean atualizar(Tarefa tarefaAtualizada) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId() == tarefaAtualizada.getId()) {
                tarefas.set(i, tarefaAtualizada);
                return true;
            }
        }
        return false;
    }

    // DELETAR
    public boolean remover(int id) {
        return tarefas.removeIf(t -> t.getId() == id);
    }
}

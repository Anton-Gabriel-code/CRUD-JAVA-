package service;

import model.Tarefa;
import repository.TarefaRepository;

import java.time.LocalDate;
import java.util.List;

public class TarefaService {

    private TarefaRepository repository = new TarefaRepository();

    public Tarefa cadastrar(String titulo, String descricao, LocalDate dataConclusao) {
        Tarefa tarefa = new Tarefa(0, titulo, descricao, dataConclusao);
        return repository.salvar(tarefa);
    }

    public List<Tarefa> listar() {
        return repository.listar();
    }

    public Tarefa buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public boolean atualizar(int id, String titulo, String descricao, LocalDate dataConclusao) {
        Tarefa tarefa = buscarPorId(id);
        if (tarefa != null) {
            tarefa.setTitulo(titulo);
            tarefa.setDescricao(descricao);
            tarefa.setDataConclusao(dataConclusao);
            return repository.atualizar(tarefa);
        }
        return false;
    }

    public boolean remover(int id) {
        return repository.remover(id);
    }
}
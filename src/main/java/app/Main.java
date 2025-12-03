package app;

import service.TarefaService;
import model.Tarefa;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        TarefaService service = new TarefaService();
        int opcao;

        do {
            System.out.println("\n=== GERENCIAMENTO DE TAREFAS ===");
            System.out.println("1 - Cadastrar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Atualizar Tarefa");
            System.out.println("4 - Excluir Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Data de conclusão (AAAA-MM-DD): ");
                    LocalDate data = LocalDate.parse(sc.nextLine());

                    Tarefa nova = service.cadastrar(titulo, descricao, data);
                    System.out.println("Tarefa cadastrada: " + nova);
                    break;

                case 2:
                    System.out.println("\n--- Tarefas Cadastradas ---");
                    service.listar().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID da tarefa para atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo título: ");
                    String novoTitulo = sc.nextLine();

                    System.out.print("Nova descrição: ");
                    String novaDesc = sc.nextLine();

                    System.out.print("Nova data (AAAA-MM-DD): ");
                    LocalDate novaData = LocalDate.parse(sc.nextLine());

                    if (service.atualizar(idAtualizar, novoTitulo, novaDesc, novaData)) {
                        System.out.println("Atualizada com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("ID da tarefa a excluir: ");
                    int idExcluir = sc.nextInt();

                    if (service.remover(idExcluir)) {
                        System.out.println("Tarefa excluída!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
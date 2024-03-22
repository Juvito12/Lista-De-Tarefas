package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Lista de Tarefas =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Exibir Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = scanner.nextLine();
                    listaDeTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indice = scanner.nextInt();
                        if (indice >= 1 && indice <= listaDeTarefas.size()) {
                            listaDeTarefas.remove(indice - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido!");
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia!");
                    }
                    break;
                case 3:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
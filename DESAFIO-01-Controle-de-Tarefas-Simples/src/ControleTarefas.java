import java.util.Scanner;

public class ControleTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê descrições das tarefas / lee descripciones de las tareas
        System.out.println("Digite a descricao da tarefa 1:");
        String descricao1 = scanner.nextLine();

        System.out.println("Digite a descricao da tarefa 2:");
        String descricao2 = scanner.nextLine();

        // cria tarefas / crea tareas
        Tarefa tarefa1 = new Tarefa(descricao1);
        Tarefa tarefa2 = new Tarefa(descricao2);

        // pergunta qual concluir / pregunta cuál concluir
        System.out.println("Qual tarefa deseja marcar como concluida? (1 ou 2)");
        int numero = scanner.nextInt();

        // altera status / cambia estado
        if (numero == 1) {
            tarefa1.marcarConcluida();
        } else if (numero == 2) {
            tarefa2.marcarConcluida();
        }

        // exibe resultado / muestra resultado
        System.out.println(tarefa1.formatar());
        System.out.println(tarefa2.formatar());

        scanner.close(); // fecha o scanner / cierra el scanner
    }
}

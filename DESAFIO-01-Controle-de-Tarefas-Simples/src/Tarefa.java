// Classe que representa uma tarefa / Clase que representa una tarea
class Tarefa {
    String descricao;
    boolean concluida;

    // construtor / constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // começa pendente / empieza pendiente
    }

    // marca como concluída / marca como concluida
    public void marcarConcluida() {
        this.concluida = true;
    }

    // retorna texto formatado / devuelve texto formateado
    public String formatar() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }
}

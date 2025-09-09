# desafio 01 - controle de tarefas simples

## _o que é
um programa em java que permite criar tarefas, marcar como concluídas e exibir no formato:
[ ] descrição (pendente)  
[X] descrição (concluída)

---

## _por que
o objetivo é praticar programação orientada a objetos (poo), criando uma classe simples e aplicando métodos básicos para manipular o estado de um objeto.

## _como foi feito
foi criada a classe `Tarefa` com os atributos `descricao` e `concluida`.  
há um método para marcar como concluída e outro para formatar a saída.  
no programa principal (`ControleTarefas`), duas tarefas são criadas, o usuário escolhe uma para concluir e ambas são exibidas no console.

---

## _como executar
na raiz do repositório, compile e execute:

```bash
javac DESAFIO-01-Controle-de-Tarefas-Simples/src/Tarefa.java DESAFIO-01-Controle-de-Tarefas-Simples/src/ControleTarefas.java
java -cp DESAFIO-01-Controle-de-Tarefas-Simples/src ControleTarefas

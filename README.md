# Desafio Técnico GFT – Java
Criado por: **Nay Rodrigues**

Cada desafio possui README próprio com **instruções de execução**, **detalhamento do projeto** e **lógica da resolução**.

---

## 📂 Estrutura do Repositório

TESTE-GFT/
├─ README.md # Este documento (principal)
├─ .gitignore # Arquivos a ignorar no Git
├─ DESAFIO-01-Controle-de-Tarefas-Simples/
│ ├─ README.md # Instruções e explicação do desafio
│ └─ src/
│ ├─ Tarefa.java
│ └─ ControleTarefas.java
├─ DESAFIO-02-Calculo-de-Media-de-Temperaturas/
│ ├─ README.md
│ └─ src/
│ └─ MediaTemperaturas.java
└─ DESAFIO-03-Prompt-IA-Dados-Sensiveis/
└─ PROMPT.md # Prompt one-shot para boas práticas


---

## _como executar os projetos dos desafios

### _pré-requisitos
- Ter o **Java JDK** instalado e configurado no PATH.
- Testado com **Java 17**.

### _desafio 01
```bash
cd DESAFIO-01-Controle-de-Tarefas-Simples/src
javac Tarefa.java ControleTarefas.java
java ControleTarefas.
```
----
### _desafio 02
```bash
cd DESAFIO-02-Calculo-de-Media-de-Temperaturas/src
javac MediaTemperaturas.java
java MediaTemperaturas
```
----
### _desafio 03
```bash
FIO-01-Controle-de-Tarefas-Simples/src
javac Tarefa.java ControleTarefas.java
java ControleTarefas
```
----
### _desafio 02
O arquivo tem formato **.txt - não exectuável** - mas com estrutura completa para leitura e aplicação na OpenAI.

Acesse o arquivo DESAFIO-03-Prompt-IA-Dados-Sensiveis/PROMPT.md.
---

**Veja os desafios**

**_desafio 01 – Controle de Tarefas Simples**

- Classe Tarefa com atributos descricao e concluida.
- Métodos para marcar concluída e exibir no formato:
[ ] Descrição (pendente)   |   [X] Descrição (concluída)
- Programa principal com duas tarefas, uma marcada como concluída.

**_desafio 02 – Cálculo de Média de Temperaturas**

- Lê 7 temperaturas da semana.
- Calcula a média semanal.
- Mostra maior e menor temperatura.

**_desafio 03 – Prompt para IA (LLM)**

- Prompt one-shot criado para solicitar boas práticas de segurança no armazenamento de CPF (criptografia, tokenização, LGPD).


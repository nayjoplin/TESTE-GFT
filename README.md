Desafio Técnico GFT – Java  
Criado por: **Nay Rodrigues**

Cada desafio possui README próprio com **instruções de execução**, **detalhamento do projeto** e **lógica da resolução**.

---

## 📂 Estrutura do Repositório

TESTE-GFT/  
├─ README.md # Este documento (principal)  
├─ .gitignore # Arquivos a ignorar no Git  
├─ DESAFIO-01-Controle-de-Tarefas-Simples/  
│  ├─ README.md # Instruções e explicação do desafio  
│  └─ src/  
│     ├─ Tarefa.java  
│     └─ ControleTarefas.java  
├─ DESAFIO-02-Calculo-de-Media-de-Temperaturas/  
│  ├─ README.md  
│  └─ src/  
│     └─ MediaTemperaturas.java  
└─ DESAFIO-03-Prompt-IA-Dados-Sensiveis/  
   └─ PROMPT.md # Prompt one-shot para boas práticas  

---

## 🚀 Como executar os projetos dos desafios (a partir da raiz)

### 🔹 Pré-requisitos
- Ter o **Java JDK** instalado e configurado no PATH.  
- Testado com **Java 17**.

---

### Desafio 01
javac DESAFIO-01-Controle-de-Tarefas-Simples/src/Tarefa.java DESAFIO-01-Controle-de-Tarefas-Simples/src/ControleTarefas.java
java -cp DESAFIO-01-Controle-de-Tarefas-Simples/src ControleTarefas
---
### Desafio 02
javac DESAFIO-02-Calculo-de-Media-de-Temperaturas/src/MediaTemperaturas.java
java -cp DESAFIO-02-Calculo-de-Media-de-Temperaturas/src MediaTemperaturas

### Desafio 03
DESAFIO-03-Prompt-IA-Dados-Sensiveis/PROMPT.md
---
### Desafio 01 – Controle de Tarefas Simples
Classe Tarefa com atributos descricao e concluida.
Métodos para marcar concluída e exibir no formato:
[ ] Descrição (pendente)
[X] Descrição (concluída)
Programa principal com duas tarefas, uma marcada como concluída.

### Desafio 02 – Cálculo de Média de Temperaturas
Lê 7 temperaturas da semana.
Calcula a média semanal.
Mostra maior e menor temperatura.

### Desafio 03 – Prompt para IA (LLM)
Prompt one-shot criado para solicitar boas práticas de segurança no armazenamento de CPF (criptografia, tokenização, LGPD).
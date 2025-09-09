# Prompt one-shot – Boas práticas (CPF, dados sensíveis, LGPD)

Contexto: sistema em Java para a FinTechPlus Corp. O CPF está sendo salvo em texto plano no banco.

Quero boas práticas de segurança e conformidade (LGPD) para armazenar CPF de forma adequada.

# Objetivo do pedido:
- Explicar quando usar criptografia, tokenização e mascaramento (e por que CPF não deve ser apenas hasheado).
- Recomendar uma estratégia prática (ex.: criptografia com rotação de chaves + mascaramento em logs + princípio de minimização).
- Mostrar exemplos simples em Java (bibliotecas padrão ou amplamente usadas) para criptografar/decriptar e mascarar.
- Orientar sobre: gestão de chaves (KMS/HSM), logs sem dados sensíveis, controles de acesso, teste e auditoria.

# Formato da resposta esperado:
1) Comparação rápida: criptografia × tokenização × mascaramento.
2) Qual escolher para CPF e por quê.
3) Snippets Java didáticos (simples) para a solução recomendada.
4) Checklist LGPD (minimização, necessidade, segurança por padrão).

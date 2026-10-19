# ☕ Laboratório Prático de Programação Orientada a Objetos (POO)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

Repositório estruturado para consolidar os fundamentos arquiteturais de **Programação Orientada a Objetos (POO)** em Java, desenvolvido no âmbito da disciplina **COM230** do Bacharelado em Tecnologia da Informação (BTI) da **UNIVESP**.

---

## 🎯 Conceitos Chave Implementados

* **Encapsulamento Rigoroso:** Proteção de atributos com modificadores de acesso `private` e `protected`, garantindo integridade de estado e controle através de métodos assessores (*getters* e *setters*).
* **Herança e Reutilização:** Especialização de classes base através do comando `extends`.
* **Encadeamento de Construtores:** Uso da palavra-chave `super(...)` para invocação explícita de construtores das superclasses na primeira linha de execução.
* **Polimorfismo e Sobrescrita:** Redefinição semântica de métodos utilizando a anotação `@Override`.
* **Abstração e Ligação Dinâmica (*Dynamic Binding*):** Contratos arquiteturais via classes e métodos abstratos (`abstract`), cuja resolução de método é deferida para o tempo de execução (*runtime*) pela JVM.

---

## 📂 Arquitetura do Projeto

O repositório está subdividido em três módulos de negócio independentes, integrados por um único ponto de entrada para validação funcional:

### 1. Sistema Bancário (Classes Abstratas e Taxas)
Demonstra abstração estrutural e polimorfismo dinâmico.
* `Conta.java`: Superclasse abstrata que padroniza depósitos, levantamentos e declara o método abstrato obrigatório `imprimeExtrato()`. Impede instanciações genéricas diretas.
* `ContaCorrente.java`: Subclasse que aplica tarifa de manutenção operacional em cada transação financeira e formata extrato com data e hora.
* `ContaPoupanca.java`: Subclasse isenta de taxas, projetada para cálculo e apresentação de rendimentos base.

### 2. Simulador Automotivo (Sobrescrita e Modificadores)
Demonstra visibilidade de atributos herdados e alteração comportamental.
* `Carro.java`: Classe base contendo o atributo `protected int velocidade` e método padrão de aceleração unitária (+1 km/h).
* `CarroCorrida.java`: Subclasse que aplica sobrescrita (`@Override`) no método `acelera()`, aumentando o rendimento para saltos de +5 km/h.

### 3. Hierarquia Escolar (Encadeamento com `super`)
Demonstra integridade cadastral e passagem de parâmetros para entidades pai.
* `Pessoa.java`: Superclasse com dados comuns obrigatórios (`nome`, `cpf`, `idade`).
* `Aluno.java`: Especialização contendo `matricula` institucional e exibição estendida.
* `Professor.java`: Especialização contendo `disciplina` lecionada e `salario`.

### 4. Executável de Integração
* `App.java`: Classe principal contendo o método `public static void main(String[] args)`, responsável por instanciar os objetos de todos os módulos, orquestrar transações e imprimir os resultados estruturados no terminal.

---

## 💻 Exemplo de Execução (`App.java`)

A saída gerada pelo terminal valida a correta execução das regras de negócio de cada módulo:

```text
--- 1. TESTE DO SISTEMA BANCÁRIO ---
=== EXTRATO CONTA CORRENTE ===
Conta: 101
Data: 19/10/2026 14:49:55
Taxa: R$ 0.15
Saldo Líquido: R$ 1399.6999999999998
==============================

=== EXTRATO CONTA POUPANÇA ===
Conta: 202
Data-base: 19/10/2026
Saldo Total: R$ 5500.0
==============================

--- 2. TESTE DOS AUTOMÓVEIS ---
Velocidade do Carro Comum: 2 km/h
Velocidade do Carro de Corrida: 10 km/h

--- 3. TESTE DA HIERARQUIA ESCOLAR ---
Nome: Suzana | CPF: 123.456.789-00 | Idade: 25
Matrícula: UNIVESP-BTI-2026

Nome: Júlio Estrella | CPF: 987.654.321-11 | Idade: 45
Disciplina: COM230 - POO | Salário: R$ 8500.0

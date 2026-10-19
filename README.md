# Programação Orientada a Objetos - UNIVESP (COM230)

![Java](https://img.shields.io/badge/Java_25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Eclipse Adoptium](https://img.shields.io/badge/Eclipse_Adoptium-2C2255?style=for-the-badge&logo=eclipseadoptium&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![Windows 11](https://img.shields.io/badge/Windows_11-0078D4?style=for-the-badge&logo=windows&logoColor=white)
![Markdown](https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white)
![UNIVESP](https://img.shields.io/badge/UNIVESP-C8102E?style=for-the-badge&logoColor=white)

Repositório dedicado ao registro e implementação dos exercícios práticos e projetos desenvolvidos durante a disciplina de **Programação Orientada a Objetos (COM230)** do curso de Bacharelado em Tecnologia da Informação (BTI) da UNIVESP.

---

# POO_UNIVESP
Exercícios e projetos práticos da disciplina de Programação Orientada a Objetos - UNIVESP

---

## 📌 Sistema Bancário Modular

Implementação prática modelando regras de negócios bancárias para fixação dos pilares fundamentais de POO, com ênfase em **Herança**, **Polimorfismo**, **Encapsulamento** e uso de modificadores de comportamento (`super` e `final`).

### 🧱 Conceitos Aplicados

* **Encapsulamento:** Proteção do atributo `saldo` com modificador de acesso `private`, garantindo integridade das regras financeiras e operações exclusivas via métodos públicos.
* **Herança (`extends`):** Criação da superclasse `Conta` e reutilização de estrutura nas subclasses especializadas `ContaCorrente` e `ContaPoupanca`.
* **Polimorfismo e Sobrescrita (`@Override`):** Redefinição dos métodos `fazerDeposito` e `fazerSaque` na classe `ContaCorrente` para aplicar a taxa fixa de movimentação de R$ 0,15 por operação.
* **Uso da palavra reservada `super`:** Reaproveitamento da lógica de validação de saldo e movimentações da classe mãe a partir da subclasse.
* **Métodos `final`:** Definição do método `consultarSaldo()` com o modificador `final` para impedir que classes filhas modifiquem a lógica de leitura do saldo.

---

## 📂 Estrutura de Arquivos

* `Conta.java`: Superclasse base contendo atributos de identificação (`nroConta`, `saldo`), operações padrão de depósito/saque e método imutável de consulta de saldo.
* `ContaCorrente.java`: Subclasse que adiciona a regra de negócio com retenção de taxa por operação via sobrescrita polimórfica.
* `ContaPoupanca.java`: Subclasse que herda diretamente o comportamento integral da classe base sem taxas operacionais.
* `App.java`: Ponto de entrada da aplicação (`main`) responsável por instanciar os objetos e validar as regras em tempo de execução.

---

## 🖥️ Resultado da Execução

```text
--- BEM VINDO AO BANCO UNIVESP ---
Saldo inicial da Conta Corrente: 1000.0
Será cobrada uma taxa de depósito: 0.15
Saldo após depósito: 1499.85
Será cobrada uma taxa de saque: 0.15
Saldo após saque: 1399.6999
```

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java (JDK Eclipse Temurin)
* **Ambiente de Desenvolvimento:** Visual Studio Code
* **Versionamento:** Git & GitHub

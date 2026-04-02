# 💰 Conta Bancária em Java

Projeto desenvolvido como exercício do curso da DIO para praticar conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco em **encapsulamento**, **classes** e **lógica de negócio**.

---

## 📚 Conceitos aplicados

* Encapsulamento
* Criação de classes e objetos
* Construtores
* Métodos
* Lógica condicional
* Interação com o usuário via terminal (Scanner)

---

## ⚙️ Funcionalidades

A aplicação simula uma conta bancária com as seguintes operações:

* ✔️ Consultar saldo
* ✔️ Consultar cheque especial
* ✔️ Depositar dinheiro
* ✔️ Sacar dinheiro
* ✔️ Pagar boleto
* ✔️ Verificar uso do cheque especial
* ✔️ Menu interativo no terminal

---

## 🧠 Regras de negócio

* O valor do cheque especial é definido na criação da conta:

  * Até R$500 → limite de R$50
  * Acima de R$500 → 50% do valor depositado

* O cheque especial é somado ao saldo disponível para saque

* Caso o cheque especial seja utilizado:

  * É aplicada uma taxa de **20% sobre o valor utilizado**
  * A taxa é cobrada quando houver saldo suficiente

---

## 🖥️ Como executar o projeto

### ⚠️ Pré-requisitos
- Java (JDK 8 ou superior)

1. Clone o repositório:
```bash
git clone https://github.com/sarahrbz/Simulador-de-Conta-Bancaria
```

2. Acesse a pasta do projeto:
```bash
cd Simulador-de-Conta-Bancaria
```

3. Compile:
```bash
javac *.java
```

4. Execute:
```bash
java Main
```

## 🎯 Objetivo

Este projeto tem como objetivo reforçar conceitos básicos de Java e simular regras simples de um sistema bancário, ajudando no desenvolvimento do raciocínio lógico e boas práticas de programação.

---

## 🚀 Melhorias futuras

* Validação de entradas do usuário
* Interface gráfica
* Persistência de dados
* Testes automatizados

---

## 👩‍💻 Autor

Sarah Souza ✨

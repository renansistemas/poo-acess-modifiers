# Projeto Básico Java - Modificadores de Acesso e POO

Este projeto tem como objetivo testar os modificadores de acesso `private`, `public`, `protected` e `default`, juntamente com alguns conceitos de Programação Orientada a Objetos (POO).

## Modificadores de Acesso

- **private:** O membro pode ser acessado apenas dentro da classe.
- **public:** Pode ser acessado por qualquer classe.
- **protected:** O membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.
- **default:** O membro pode ser acessado por classes do mesmo pacote.

## Construtor

- É uma operação especial da classe, que executa no momento da instanciação do objeto.
- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão.
- É possível especificar mais de um construtor na mesma classe (sobrecarga).

## Sobrecarga

- É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

## Encapsulamento

- É um princípio que consiste em proteger os dados de um objeto e permitir que eles sejam acessados ou modificados apenas de maneiras controladas.
- **Exemplo:** Uma conta bancária que protege o saldo, não permitindo definir um valor negativo diretamente, sendo necessário passar pelo método `depositar()` ou `sacar()` para assim modificar o saldo.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java/org/renan/Main.java`: Classe principal que executa o programa.
- `src/main/java/org/renan/entities/ContaBancaria.java`: Classe que representa uma conta bancária com métodos para depósito e saque.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver o projeto.
- **Maven:** Ferramenta de automação de compilação e gerenciamento de dependências.
- **Lombok:** Biblioteca utilizada para reduzir o código boilerplate, como getters, setters e construtores.

## Dependências

As dependências do projeto estão definidas no arquivo `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.32</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## Execução do Projeto
Para executar o projeto, utilize a classe Main que contém o método main:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Programa Conta Bancária");
        ContaBancaria contaBancaria = new ContaBancaria(1, "Renan Silva Freitas", 1000.0);
        contaBancaria.deposit(500.0);
        contaBancaria.withdraw(100.0);
    }
}
```
Este projeto demonstra conceitos básicos de POO e modificadores de acesso em Java, utilizando Maven para gerenciamento de dependências e Lombok para simplificação do código.

Autor: Renan

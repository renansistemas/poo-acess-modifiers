package org.renan;

import org.renan.entities.ContaBancaria;

public class Main {


    public static void main(String[] args) {
        System.out.println("Programa Conta Banária");
        ContaBancaria contaBancaria = new ContaBancaria(1, "Renan Silva Freitas", 1000.0);
        contaBancaria.deposit(500.0);
        contaBancaria.withdraw(100.0);
    }
}

package org.renan;

import org.renan.entities.ContaBancaria;

public class Main {


    public static void main(String[] args) {
        System.out.println("Programa Conta Banária");
        ContaBancaria contaBancaria = new ContaBancaria("0001", "Renan Silva Freitas", 1000.0, 5.0);
        contaBancaria.depositar(500.0);
        contaBancaria.sacar(100.0);

    }
}

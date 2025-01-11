package org.renan.entities;

import lombok.Data;

@Data
public class ContaBancaria {

    private Integer number;
    private String holder;
    private double balance;

    public ContaBancaria(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public ContaBancaria(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    // Encapsulando a regra de negócio de deposito
    public void deposit(Double amount) {
        this.balance += amount;
        System.out.println("Deposit successful! Your balance is: " + balance);
    }

    public void withdraw(Double amount) {
        this.balance -= amount + 5.0;
        System.out.println("Withdraw successful! Your balance is: " + balance);
    }
}

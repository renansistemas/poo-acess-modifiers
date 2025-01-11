package org.renan.entities;

import lombok.Data;

@Data
public class ContaBancaria {

    private String conta;
    private String titular;
    private Double depositoInicial;
    private Double saldo;
    private Double valorDeposito;
    private Double valorSaque;
    private Double taxaSaque;

    public ContaBancaria(String conta, String titular, Double depositoInicial, Double taxaSaque) {
        this.conta = conta;
        this.titular = titular;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
        this.taxaSaque = taxaSaque;
    }

    public void depositar(Double valorDeposito) {
        saldo = saldo + valorDeposito;
        System.out.println("Depósito realizado com sucesso! Seu saldo é: " + saldo);
    }

    public void sacar(Double valorSaque) {
        saldo += valorSaque - taxaSaque;
        System.out.println("Saque realizado com sucesso! Seu saldo é: " + saldo);
    }
}

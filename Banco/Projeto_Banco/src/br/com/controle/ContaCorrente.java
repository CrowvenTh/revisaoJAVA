/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class ContaCorrente {

    private double saldo;
    private double deposito;
    private double saque;

    Scanner scanner = new Scanner(System.in);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void Depositar() {
        System.out.println("Insira o valor do depoósito");
        deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.println("Depósito de R$" + this.deposito + " realizado com sucesso!\nSaldo atual: R$" + saldo);
    }

    public void Sacar() {
        System.out.println("Insira o valor do saque");
        saque = scanner.nextDouble();
        if (saque > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= saque;
            System.out.println("Saque de R$" + saque + "realizado com sucesso!\nSaldo atual: R$" + saldo);
        }
    }

    public void VerificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

}

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
    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

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
        System.out.println("Depósito de R$" + this.deposito + " realizado com sucesso!\nSaldo atual: R$" + saldo+"\n");
    }

    public void Sacar() {
        System.out.println("Insira o valor do saque");
        saque = scanner.nextDouble();
        if (saque > saldo) {
            System.out.println("Saldo insuficiente!\n");
        } else {
            saldo -= saque;
            System.out.println("Saque de R$" + saque + "realizado com sucesso!\nSaldo atual: R$" + saldo+"\n");
        }
    }

    public void VerificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo+"\n");
    }

    public void Operacao() {
        System.out.println("| Selecione uma operação |");
        System.out.println("---| 1 = Depósito    |---");
        System.out.println("---| 2 = Saque       |---");
        System.out.println("---| 3 = Saldo       |---");
        System.out.println("---| 0 = Encerrar    |---");
        System.out.println("-------------------------");
        
        opcao = scanner.nextInt();
    }

    public void Menu() {
        System.out.println("\n-------------------------");
        System.out.println("-----| BANCO JAVA |------");
        System.out.println("-------------------------");
        Operacao();
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    Depositar();
                    Operacao();
                    break;
                case 2:
                    Sacar();
                    Operacao();
                    break;
                case 3:
                    VerificarSaldo();
                    Operacao();
                case 0:
                    System.out.println("Programa Encerrado...");
                    break;
            }
        }
    }
}

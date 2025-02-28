
package br.com.controle;

public class Main {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        
        cc.Depositar();
        cc.Sacar();
        cc.VerificarSaldo();
    }
    
}

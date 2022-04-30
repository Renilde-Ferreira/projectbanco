/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbanco;

/**
 *
 * @author Renilde Ferreira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Conta cc =  new ContaCorrente();
         cc.depositar(100);
        Conta poupanca = new ContaPoupanca();
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}

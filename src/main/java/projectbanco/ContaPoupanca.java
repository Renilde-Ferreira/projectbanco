/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbanco;

/**
 *
 * @author Renilde Ferreira
 */

public class ContaPoupanca extends Conta{
    @Override
            public void imprimirExtrato(){
    System.out.println("=== Extrato Conta Poupanca ===");
    imprimirInfosComuns();
    
   
            
  }   
    
}

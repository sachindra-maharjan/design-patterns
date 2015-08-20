/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.statepattern.atmmachine;

/**
 *
 * @author sachindra
 */
public class ATMMachineTest {
    
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        
        atm.insertCard();
        atm.insertPin(98);
        atm.requestCash(1000);
        atm.ejectCard();
        
        System.out.println("Available cash" + atm.getCashAvailable());
        
    }
}

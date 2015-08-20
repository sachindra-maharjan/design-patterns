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
public class HasNoCard implements ATMState {
    
    ATMMachine atmMachine;
    
    public HasNoCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Card Inserted");
        atmMachine.changeState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert card first");  
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Please insert card first");
    }

    @Override
    public void requestCash(double cashToWithdraw) {
        System.out.println("Please insert card first");
    }
}

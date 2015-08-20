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
public class HasNoCash implements ATMState {
    
    ATMMachine atmMachine;
    
    public HasNoCash(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    
    @Override
    public void insertCard() {
        System.out.println("We are out of cash");
        System.out.println("Your card is ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("We are out of cash");
        System.out.println("No card is inserted");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("We are out of cash");
    }

    @Override
    public void requestCash(double cashToWithdraw) {
        System.out.println("We are out of cash");
    }

}

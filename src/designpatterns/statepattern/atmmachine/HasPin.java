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
public class HasPin implements ATMState {
    private ATMMachine atmMachine;
    
    public HasPin(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Card is alredy inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card successfully ejected");
        atmMachine.changeState(atmMachine.getHasNoCard());
    }

   @Override
    public void insertPin(int pin) {
       System.out.println("Pin already inserted");
    }

    @Override
    public void requestCash(double cashToWithdraw) {
        if(atmMachine.getCashAvailable() >= cashToWithdraw){
            System.out.println("Cash Withdrawn");
            atmMachine.setCashAvailable(atmMachine.getCashAvailable() - cashToWithdraw);
            
            atmMachine.changeState(atmMachine.getHasNoCard());
            
            if(atmMachine.getCashAvailable() <= 0){
                atmMachine.changeState(atmMachine.getHasNoCash());
            }
        }else{
            System.out.println("Cash Not Available");
            System.out.println("Card is ejected");
            atmMachine.changeState(atmMachine.getHasNoCash());
        }
    }
}

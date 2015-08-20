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
public class HasCard implements ATMState {
    
    ATMMachine atmMachine;
    
    public HasCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Card is already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is successfully ejected");
        atmMachine.changeState(atmMachine.getHasNoCard());
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 9876){
            System.out.println("Correct pin was inserted");
            atmMachine.changeState(atmMachine.getHasPin());
            atmMachine.setCorrectPin(true);
        }else{
            System.out.println("Incorrect pin was inserted");
            atmMachine.setCorrectPin(false);
            System.out.println("Card is ejected");
            atmMachine.changeState(atmMachine.getHasNoCard());
        }
    }

    @Override
    public void requestCash(double cashToWithdraw) {
        System.out.println("Please insert the pin");
    }
}

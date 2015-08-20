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
public class ATMMachine {
    private ATMState atmState;
    private ATMState hasNoCard;
    private ATMState hasCard;
    private ATMState hasNoCash;
    private ATMState hasPin;
    
    private double cashAvailable = 20000;
    private boolean correctPin = false;
    
    public ATMMachine(){
        hasNoCard = new HasNoCard(this);
        hasCard   = new HasCard(this);
        hasNoCash = new HasNoCash(this);
        hasPin    = new HasPin(this);
    
        //default ATM State
        atmState = hasNoCard;
        
        if(cashAvailable <= 0){
            this.atmState = hasNoCash;
        }
    }
    
    public void changeState(ATMState atmState){
        this.atmState = atmState;
    }
    
    public void insertCard(){
        atmState.insertCard();
    }
    
    public void insertPin(int pin){
        atmState.insertPin(pin);
    }
    
    public void requestCash(double cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }
    
    public void ejectCard(){
        atmState.ejectCard();
    }

    public ATMState getHasNoCard() {
        return hasNoCard;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getHasNoCash() {
        return hasNoCash;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public boolean isCorrectPin() {
        return correctPin;
    }

    public void setCorrectPin(boolean correctPin) {
        this.correctPin = correctPin;
    }

    public double getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }
    
    
    
}

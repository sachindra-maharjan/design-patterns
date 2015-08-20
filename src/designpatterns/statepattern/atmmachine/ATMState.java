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
public interface ATMState {
    //ATMState can be HasNoCard, HasCard, HasPin, HasNoCash
    public void insertCard();
    public void ejectCard();
    public void insertPin(int pin);
    public void requestCash(double cashToWithdraw);
}

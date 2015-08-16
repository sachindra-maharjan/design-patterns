/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.order;

/**
 *
 * @author sachindra
 * Command Pattern
 * Concrete Command
 */
public class LobsterOrder implements IOrder {
    Cook cook;
    
    public LobsterOrder(Cook cook){
        this.cook = cook;
    }
    
    @Override
    public void execute() {
        this.cook.buy();
    }
}

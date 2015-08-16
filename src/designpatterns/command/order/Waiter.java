/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.order;

/**
 *
 * @author sachindra
 */
public class Waiter {
    
    public void placeOrder(IOrder order){
        order.execute();
    }
    
}

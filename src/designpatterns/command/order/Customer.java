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
public class Customer {
    
    public static void main(String[] args) {
        Cook cook = new Cook();
    
    IOrder grill = new GrillOrder(cook);
    IOrder sour  = new SourOrder(cook);
    IOrder lobster = new LobsterOrder(cook);
   
    Waiter waiter = new Waiter();
    waiter.placeOrder(grill);
    waiter.placeOrder(sour);
    waiter.placeOrder(lobster);
    
    
    
    }
    
    
    
}

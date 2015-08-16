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
public class Cook {
    
    public void buy(){
        System.out.println("Buy Command Recieved");
    }
    
    public void sell(){
        System.out.println("Sell Command Received");
    }
    
}

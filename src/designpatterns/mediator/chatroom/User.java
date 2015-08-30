/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.mediator.chatroom;

/**
 *
 * @author sachindra
 */
public interface User {
    
    public void sendMessage(String msg);
    public void receiveMessage();
    
}

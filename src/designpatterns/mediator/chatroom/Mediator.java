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
public interface Mediator {
    
    public void sendMessage(String msg, User user);
    public void addUsers(User user);
    public String getMsg();
    
}

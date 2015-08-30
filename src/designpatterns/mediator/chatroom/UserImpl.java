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
public class UserImpl implements User {
    
    Mediator mediator;
    String name;
    
    public UserImpl(String name, Mediator mediator){
        this.mediator = mediator;
        this.name = name;
    }
    
    public UserImpl(){}
    
    public UserImpl(Mediator mediator){
        this.mediator = mediator;
    }
    
    @Override
    public void sendMessage(String msg) {
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Message received by " + this.name + " :" + mediator.getMsg());
    }    
}

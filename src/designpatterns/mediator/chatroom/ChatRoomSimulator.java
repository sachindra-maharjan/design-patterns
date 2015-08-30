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
public class ChatRoomSimulator {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        User user1 = new UserImpl("Ram", mediator);
        User user2 = new UserImpl("Hari", mediator);
        User user3 = new UserImpl("Shyam", mediator);
        
        mediator.addUsers(user1);
        mediator.addUsers(user2);
        mediator.addUsers(user3);
        
        user1.sendMessage("Hi! This is Ram");
        user2.sendMessage("Hi! This is Hari");
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sachindra
 */
public class MediatorImpl implements Mediator {
    
    List<User> userList;
    String msg;
    
    public MediatorImpl(){
        userList = new ArrayList<>();
    }
        
    @Override
    public void sendMessage(String msg, User user) {
        this.msg = msg;
        for(User u: userList){
            if(u != user){
                u.receiveMessage();
            }
        }
    }

    @Override
    public void addUsers(User user) {
        userList.add(user);
    }

    public String getMsg() {
        return msg;
    }
}

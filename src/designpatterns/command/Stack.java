/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sachindra
 * Command Pattern
 * Receiver
 * 
 */
public class Stack {
    private List<String> stack;
    
    public Stack(){
        stack = new LinkedList<>();
    }
    
    public void push(String pushString){
        stack.add(pushString);
    }
    
    public String pop(){
        int index = stack.size() - 1;
        if(index >= 0){
            return stack.remove(index);
        }
        return "";
    }

    public int getSize(){
        return this.stack.size();
    }
    
    public void print(){
        for(String s: stack){
            System.out.println(s);
        }
    }
}

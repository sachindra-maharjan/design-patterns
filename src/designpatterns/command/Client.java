/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command;

/**
 *
 * @author sachindra
 */
public class Client {
    
    public static void main(String[] args) {
        Stack stack = new Stack(); //Reciever
        PushCommand push1 = new PushCommand(stack, "Sachindra");
        PushCommand push2 = new PushCommand(stack, "Rukesh");
        PopCommand pop1 = new PopCommand(stack);
        
        Invoker invoker = new Invoker();
        invoker.placeCommand(push1);
        invoker.placeCommand(push2);
        invoker.placeCommand(pop1);
       
        invoker.undo();
        invoker.redo();
        invoker.redo();
        invoker.redo();
        invoker.undo();
        invoker.redo();
        
        stack.print();
        
    }
    
}

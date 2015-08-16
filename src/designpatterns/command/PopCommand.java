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
public class PopCommand implements ICommand{
    
    Stack stack;
    String pushString;
    
    public PopCommand(Stack stack){
        this.stack = stack;
    }
    
    @Override
    public void execute() {
        System.out.println("Pop Command executed");
        pushString = this.stack.pop();
    }

    @Override
    public void unexecute() {
        System.out.println("Pop unexecuted: " + pushString + " pushed to stack");
        this.stack.push(pushString);
    }
    
}

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
public class PushCommand implements ICommand{
    Stack stack;
    String pushString;
    
    public PushCommand(Stack stack, String pushString) {
        this.stack = stack;
        this.pushString = pushString;
    }

    @Override
    public void execute() {
        System.out.println("Push Command executed : " + pushString + " pushed to stack");
        this.stack.push(pushString);
    }

    @Override
    public void unexecute() {
         System.out.println("Push unexecuted");
         this.pushString = this.stack.pop();
    }
}

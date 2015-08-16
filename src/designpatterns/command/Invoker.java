/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sachindra
 * Command Pattern
 * Invoker
 * 
 */
public class Invoker {
    
    List<ICommand> commandList;
    int index;
    
    public Invoker(){
        commandList = new ArrayList<>();
        index = -1;
    }
    
    public void placeCommand(ICommand command){
        commandList.add(command);
        command.execute();
        index++;
    }
    
    public void undo(){
        if(index > 0){
            ICommand command = commandList.get(index);
            command.unexecute();
            index--;
        }
    }
    
    public void redo(){
        if(index >= -1){
        
            if(++index >= this.getSize()){
                index--;
            }else{
                ICommand command = commandList.get(index);
                command.execute();
            }
            
        }
    }
    
    public int getSize(){
        return commandList.size();
    }
    
    
}

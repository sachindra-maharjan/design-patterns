/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.statepattern.StateOfAC;

/**
 *
 * @author sachindra
 */
public class AirConditioner {
   State state;
   
   public AirConditioner(){
       state = new Off();
   }
   
   public void setState(State state){
       this.state = state;
   }
   
   public void rotate(){
       state.rotate(this);
   }
}

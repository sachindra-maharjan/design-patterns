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
public class High extends State {
    @Override
    public void rotate(AirConditioner ac) {
        System.out.println("State changed to Off");
        ac.setState(new Off());
    }
    
}

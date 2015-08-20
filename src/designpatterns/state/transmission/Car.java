/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.state.transmission;

/**
 *
 * @author sachindra
 */
public class Car {
    private Transmission transmission;
    private int currentspeed;
 
    public Car(){
        transmission = Park.getInstance();
    }

    public int getCurrentspeed() {
        return currentspeed;
    }
    
    public void setCurrentspeed(int speed){
        this.currentspeed = speed;
    }
    
    public void changeGear(Transmission transmission){
        this.transmission = transmission;
    }
    
    public void changeSpeed(int speed){
        if(speed > currentspeed){
            this.transmission.shiftup(this, speed);
        }else if(speed < currentspeed){
            this.transmission.shiftdown(this, speed);
        }
    }
}

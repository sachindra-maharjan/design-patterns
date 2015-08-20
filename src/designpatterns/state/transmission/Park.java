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
public class Park implements Transmission{
    
    private static Park instance = new Park();
    
    private Park(){}
    
    public static Park getInstance(){
        return instance;
    }
    
    @Override
    public void shiftup(Car car, int speed) {
        
        if(speed > 0 && speed < 5){
            System.out.println("Car is in Gear1 State");
            car.changeGear(Gear1.getInstance());
            car.setCurrentspeed(speed);
        }else if(speed>5){
            System.out.println("Gear1 : Move to next gear");
            car.changeGear(Gear1.getInstance());
            car.changeSpeed(speed);
        }
    }

    @Override
    public void shiftdown(Car car, int speed) {
        System.out.println("Car is in Parked State");
        //car.setCurrentspeed(speed);
    }
}

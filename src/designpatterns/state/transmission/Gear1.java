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
public class Gear1 implements Transmission {

    private static Gear1 instance = new Gear1();
    
    private Gear1(){}
    
    public static Gear1 getInstance(){
        return instance;
    }
    
    @Override
    public void shiftup(Car car, int speed) {
        if(speed > 5 && speed <= 10){
            System.out.println("Car is in Gear2 State");
            car.changeGear(Gear2.getInstance());
            car.setCurrentspeed(speed);
        }else if (speed > 10){
            System.out.println("Gear2 : Move to next gear");
            car.changeGear(Gear2.getInstance());
            car.changeSpeed(speed);
        }
    }

    @Override
    public void shiftdown(Car car, int speed) {
        if(car.getCurrentspeed() <= 0){
            car.changeGear(Park.getInstance());
            System.out.println("Car is in Parked State");
            car.setCurrentspeed(speed);
        }
    }
}

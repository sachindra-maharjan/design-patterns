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
public class Gear2 implements Transmission {
    
    private static Gear2 instance = new Gear2();
    
    private Gear2(){}
    
    public static Gear2 getInstance(){
        return instance;
    }

    @Override
    public void shiftup(Car car, int speed) {
        if(speed > 10 && speed <= 30){
            System.out.println("Car is in Gear3 State");
            car.changeGear(Gear3.getInstance());
            car.setCurrentspeed(speed);
        }else if (speed > 30){
            System.out.println("Gear3 : Move to next gear");
            car.changeGear(Gear3.getInstance());
            car.changeSpeed(speed);
        }
    }

    @Override
    public void shiftdown(Car car, int speed) {
        if(speed > 0 && speed < 5){
            System.out.println("Car is in Gear1 State");
            car.changeGear(Gear1.getInstance());
            car.setCurrentspeed(speed);
        }else if(speed <= 0){
            System.out.println("Gear 1 : Move to gear below");
            car.changeGear(Park.getInstance());
            car.changeSpeed(speed);
        }
    }
}

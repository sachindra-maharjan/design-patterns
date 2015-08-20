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
public class Gear3 implements Transmission{
    
    private static Gear3 instance = new Gear3();
    
    private Gear3(){}
    
    public static Gear3 getInstance(){
        return instance;
    }
    
    
    @Override
    public void shiftup(Car car, int speed) {
        if(speed > 30 && speed <= 55){
            System.out.println("Car is in Gear4 State");
             car.changeGear(Gear4.getInstance());
            car.setCurrentspeed(speed);
        }else if(speed > 55){
            System.out.println("Gear4 : Move to next gear");
             car.changeGear(Gear4.getInstance());
            car.changeSpeed(speed);
        }
    }

    @Override
    public void shiftdown(Car car, int speed) {
        if(speed > 5 && speed <= 10){
            System.out.println("Car is in Gear2 State");
            car.changeGear(Gear2.getInstance());
            car.setCurrentspeed(speed);
        }else if(speed <= 5){
            System.out.println("Gear 2: Move to gear below");
            car.changeGear(Gear2.getInstance());
            car.changeSpeed(speed);
        }
    }
    
}

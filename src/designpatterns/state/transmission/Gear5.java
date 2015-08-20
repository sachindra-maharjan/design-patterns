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
public class Gear5 implements Transmission{

    private static Gear5 instance = new Gear5();
    
    private Gear5(){}
    
    public static Gear5 getInstance(){
        return instance;
    }
    
    @Override
    public void shiftup(Car car, int speed) {
        System.out.println("Car is in Gear5 State");
        car.setCurrentspeed(speed);
    }

    @Override
    public void shiftdown(Car car, int speed) {
        
        if(speed > 30 && speed <= 55){
            System.out.println("Car is in Gear4 State");
            car.changeGear(Gear4.getInstance());
            car.setCurrentspeed(speed);
        }else if (speed <= 30){
            System.out.println("Gear 4: Move to gear below");
            car.changeGear(Gear4.getInstance());
            car.changeSpeed(speed);
        }
    }
    
}

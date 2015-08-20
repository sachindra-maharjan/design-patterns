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
public class Gear4 implements Transmission {

    private static Gear4 instance = new Gear4();
    
    private Gear4(){}
    
    public static Gear4 getInstance(){
        return instance;
    }
    
    @Override
    public void shiftup(Car car, int speed) {
        if(speed > 55){
            System.out.println("Car is in Gear5 State");
            car.changeGear(Gear5.getInstance());
            car.setCurrentspeed(speed);
        }
    }

    @Override
    public void shiftdown(Car car, int speed) {
        if(speed > 10 && speed <= 30){
            System.out.println("Car is in Gear3 State");
            car.changeGear(Gear3.getInstance()); 
            car.setCurrentspeed(speed);
        }else if(speed <= 10){
            System.out.println("Gear 3: Move to gear below");
            car.changeGear(Gear3.getInstance());  
            car.changeSpeed(speed);
        }
    }
}

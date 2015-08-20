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
public class TransmissionTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeSpeed(1);
        car.changeSpeed(8);
        car.changeSpeed(15);
        car.changeSpeed(0);
        car.changeSpeed(100);
        car.changeSpeed(11);
        
    }
}

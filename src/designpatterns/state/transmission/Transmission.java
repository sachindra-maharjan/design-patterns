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
public interface Transmission {
    public void shiftup(Car car, int speed);
    public void shiftdown(Car car, int speed);
}

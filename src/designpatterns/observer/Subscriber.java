/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

/**
 *
 * @author sachindra
 */
public interface Subscriber {
    public void update();
    public void setNewsPublisher(NewsPublisher newsPublisher);    
}

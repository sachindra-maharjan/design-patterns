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
public class SMSSubscriber implements Subscriber {
    
    private NewsPublisher newsPublisher;
    
    @Override
    public void update() {
        System.out.println("---Getting News from SMS Subscriber---");
        System.out.println("Latest News: " + newsPublisher.getLatestNews());
    }

    @Override
    public void setNewsPublisher(NewsPublisher newsPublisher) {
        this.newsPublisher = newsPublisher;
    }
    
}

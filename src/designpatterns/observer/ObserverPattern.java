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
public class ObserverPattern{
    
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new BusinessNewPublisher();
    
        Subscriber emailSubscriber = new EmailSubscriber();
        emailSubscriber.setNewsPublisher(newsPublisher);
        
        Subscriber smsSubscriber = new SMSSubscriber();
        smsSubscriber.setNewsPublisher(newsPublisher);
    
        newsPublisher.attach(smsSubscriber);
        newsPublisher.attach(emailSubscriber);
        
        newsPublisher.addLatestNews("Manchester Utd 1 - 0 AstonVilla");
        
        newsPublisher.addLatestNews("\nSpurs 2 - 2 Stoke City");
        
        
    
    }
    
    
    
    
    
    

    
}

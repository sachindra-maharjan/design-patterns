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
public class SportNewsPublisher extends NewsPublisher {
    
    public SportNewsPublisher(){
        super();
    }
    
    @Override
    public void attach(Subscriber subscriber) {
        if(subscriber == null)
            throw new NullPointerException("No Subscriber Passed");
        
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        if(subscriber == null)
            throw new NullPointerException("No Subscriber Passed");
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s: subscribers){
           s.update();
        }
    }

    @Override
    public String getLatestNews() {
        return latestNews;
    }

    @Override
    public void addLatestNews(String news) {
        latestNews =  latestNews + news;
        notifySubscribers();
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sachindra
 */
public abstract class NewsPublisher {
    protected List<Subscriber> subscribers;
    protected String latestNews = "";
    
    public NewsPublisher(){
        subscribers = new ArrayList<>();
    }
    
    public abstract void  attach(Subscriber subscriber);
    public abstract void detach(Subscriber subscriber);
    public abstract void notifySubscribers();
    public abstract String getLatestNews();
    public abstract void addLatestNews(String news);
   
}

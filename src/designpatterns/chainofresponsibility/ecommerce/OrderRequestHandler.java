/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chainofresponsibility.ecommerce;

import java.util.Random;

/**
 *
 * @author sachindra
 */
public abstract class OrderRequestHandler {
   OrderRequestHandler successor;
   boolean isRequestHandled;
   
   public void setRequestHandler(OrderRequestHandler successor){
       this.successor = successor;
   }
   
   public  abstract boolean handleRequestImpl(OrderRequest orderRequest);
   
   public void handleRequest(OrderRequest orderRequest){
       isRequestHandled = this.handleRequestImpl(orderRequest);
       if(successor != null && isRequestHandled){
           successor.handleRequest(orderRequest);
       }
   }
   
   public boolean isProcessingComplete(){
       
       int number = randInt(1, 100);
       System.out.println("number: " + number);
       return number <= 90;
   }
   
   private static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
}

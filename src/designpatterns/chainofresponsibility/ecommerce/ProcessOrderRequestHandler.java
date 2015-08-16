/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chainofresponsibility.ecommerce;

/**
 *
 * @author sachindra
 */
public class ProcessOrderRequestHandler extends OrderRequestHandler {

        boolean isProcessed; 
    
    @Override
    public boolean handleRequestImpl(OrderRequest orderRequest) {
         isProcessed = super.isProcessingComplete();
         if(isProcessed){
             System.out.println("Order Processing Complete");
             return true;
         }else{
             System.out.println("Order Processing can not be done at this time");
             return false;
         }
    }

    
}

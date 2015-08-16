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
public class EcommerceChain {
    public static void main(String[] args) {
        ValidateOrderRequestHandler validator = new ValidateOrderRequestHandler();
        ProcessOrderRequestHandler processor = new ProcessOrderRequestHandler();
        ShipOrderRequestHandler shipper = new ShipOrderRequestHandler();
        
        validator.setRequestHandler(processor);
        processor.setRequestHandler(shipper);
        
        validator.handleRequest(new OrderRequest(1, "Portable HDD", 400));
        System.out.println("==========================================");
        validator.handleRequest(new OrderRequest(1, "Macbook", 1200));
        System.out.println("==========================================");
        validator.handleRequest(new OrderRequest(1, "Villa", 600000));
        System.out.println("==========================================");
        
    }
    
}

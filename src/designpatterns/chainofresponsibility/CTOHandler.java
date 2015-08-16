/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chainofresponsibility;

/**
 *
 * @author sachindra
 */
public class CTOHandler extends RequestHandler {

    @Override
    public void handleRequest(PurchaseRequest request) {
        if(request.getPrice() > 1000){
           System.out.println("Purchase Request of "+request.getProductName()+" can be handled by CTO Department");
        }else{
            super.getSuccesor().handleRequest(request);
        }
    }
}

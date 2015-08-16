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
public abstract class RequestHandler {
    RequestHandler succesor;
    
    public void setSuccessor(RequestHandler requestHandler){
        this.succesor = requestHandler;
    }

    public RequestHandler getSuccesor() {
        return succesor;
    }

    public abstract void handleRequest(PurchaseRequest request);
}

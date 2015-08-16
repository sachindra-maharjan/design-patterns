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
public class ChainOfResponsibility {
    
    public static void main(String[] args) {
       RequestHandler deptHandler = new SystemDepartmentHandler();
       RequestHandler hrHandler = new HRManagerHandler();
       RequestHandler ctoHandler = new CTOHandler();
 
       deptHandler.setSuccessor(hrHandler);
       ctoHandler.setSuccessor(ctoHandler);
       
       deptHandler.handleRequest(new PurchaseRequest("Keyboard", 40));
       deptHandler.handleRequest(new PurchaseRequest("Monitor", 520));
       deptHandler.handleRequest(new PurchaseRequest("Laptop", 1200));
       
    }
    
}

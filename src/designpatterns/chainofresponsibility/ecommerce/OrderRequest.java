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
public class OrderRequest {
    private int orderId;
    private String product;
    private double totalPrice;

    public OrderRequest(int orderId, String product, double totalPrice) {
        this.orderId = orderId;
        this.product = product;
        this.totalPrice = totalPrice;
    }
   
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
}

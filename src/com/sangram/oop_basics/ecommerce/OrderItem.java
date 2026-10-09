package com.sangram.oop_basics.ecommerce;

public class OrderItem {

    private String productId;
    private String productName;
    private double price;

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OrderItem(String productName, String productId , double price){
        this.price = price;
        this.productId = productId;
        this.productName = productName;
    }
}

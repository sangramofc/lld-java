package com.sangram.oop_basics.ecommerce;

public class OrderProcessor {

    public static void applyFlashSale(Order order, OrderItem item, double newPrice){
        item.setPrice(newPrice);
        order = new Order("hacked@system.com");
    }
}

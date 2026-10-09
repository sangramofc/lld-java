package com.sangram.oop_basics.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long orderId;
    private String email;
    private String status;
    List<OrderItem> items;

    public long getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(long orderId, String email, String status, List<OrderItem> items) {
        this.email = email;
        this.orderId = orderId;
        this.status = status;
        this.items = items;
    }

    public Order(long orderId, String email) {
        this(orderId, email, "DRAFT", new ArrayList<>());
    }

    public Order(String email) {
        this(System.currentTimeMillis(), email);
    }

    public Order(Order existingOrder) {
        this.orderId = existingOrder.getOrderId() + 1000;
        this.email = existingOrder.getEmail();
        this.status = "DRAFT";
        this.items = existingOrder.items;
    }
}

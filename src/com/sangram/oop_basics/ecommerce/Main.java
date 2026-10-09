package com.sangram.oop_basics.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderItem p1 = new OrderItem("Laptop", "L@1234", 45000);
        OrderItem p2 = new OrderItem("Mouse", "M@1234", 500);

        List<OrderItem> items = new ArrayList<>();
        items.add(p1);
        items.add(p2);

        Order initialOrder = new Order(1001L, "sangram@example.com", "PAID", items);
        Order duplicateOrder = new Order(initialOrder); // Buy-again through copy-constructor

        // Modify laptop price via duplicateOrder in applyFlashSale
        OrderProcessor.applyFlashSale(duplicateOrder, duplicateOrder.getItems().get(0), 30000);

        // --- VERIFICATION OUTPUTS ---
        System.out.println("1. Initial Order Laptop Price: " + initialOrder.getItems().get(0).getPrice());
        System.out.println("2. Duplicate Order Laptop Price: " + duplicateOrder.getItems().get(0).getPrice());
        System.out.println("3. Duplicate Order Email: " + duplicateOrder.getEmail());
    }
}
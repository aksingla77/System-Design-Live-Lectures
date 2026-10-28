package com.foodapp.model;

import com.foodapp.enums.DeliveryType;
import com.foodapp.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public static final int MAX_ITEMS = 20;
    private static int orderCounter = 0;

 


    private final int orderId;
    private final DeliveryType deliveryType;
    private final List<MenuItem> items = new ArrayList<>();
    private OrderStatus status;

    public Order(DeliveryType deliveryType) {
        orderCounter++;
        this.orderId = orderCounter;
        this.deliveryType = deliveryType;
        this.status = OrderStatus.PLACED;
    }

    public void addItem(MenuItem item) {
        if (items.size() >= MAX_ITEMS) {
            throw new IllegalStateException("An order can have at most " + MAX_ITEMS + " items");
        }
        items.add(item);
    }

    public double getTotalAmount() {
        double total = deliveryType.getFee();
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public static int getTotalOrders() {
        return orderCounter;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " " + items + " | " + deliveryType
                + " delivery | total Rs " + getTotalAmount() + " | " + status;
    }
}

package com.foodapp.quiz.q11;

class Order {
    private static int orderCounter = 0;
    private int orderId;

    Order() {
        orderCounter++;
        this.orderId = orderCounter;
    }

    static int getTotalOrders() {
        return orderCounter;
    }

    int getOrderId() {
        return orderId;
    }
}

package com.foodapp;

import com.foodapp.enums.DeliveryType;
import com.foodapp.enums.OrderStatus;
import com.foodapp.model.MenuItem;
import com.foodapp.model.Order;
import com.foodapp.model.Wallet;
import com.foodapp.service.OrderService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem dosa = new MenuItem("Masala Dosa", 120);
        MenuItem paneer = new MenuItem("Paneer Tikka", 250);
        MenuItem biryani = new MenuItem("Chicken Biryani", 320, false);

        Wallet wallet = new Wallet();
        wallet.addMoney(1000);

        OrderService orderService = new OrderService();

        Order first = orderService.placeOrder(wallet, List.of(dosa, paneer), DeliveryType.STANDARD);
        first.updateStatus(OrderStatus.DELIVERED);
        System.out.println(first);

        Order second = orderService.placeOrder(wallet, List.of(biryani), DeliveryType.EXPRESS);
        System.out.println(second);

        System.out.println("Wallet balance: Rs " + wallet.getBalance());
        System.out.println("Total orders placed: " + Order.getTotalOrders());

        try {
            orderService.placeOrder(wallet, List.of(biryani), DeliveryType.EXPRESS);
        } catch (IllegalStateException e) {
            System.out.println("Order failed: " + e.getMessage());
        }

        try {
            wallet.addMoney(-500);
        } catch (IllegalArgumentException e) {
            System.out.println("Add money failed: " + e.getMessage());
        }
    }
}

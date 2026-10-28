package com.foodapp.service;

import com.foodapp.enums.DeliveryType;
import com.foodapp.model.MenuItem;
import com.foodapp.model.Order;
import com.foodapp.model.Wallet;

import java.util.List;

public class OrderService {

    public Order placeOrder(Wallet wallet, List<MenuItem> items, DeliveryType deliveryType) {

        Order order = new Order(deliveryType);
        for (MenuItem item : items) {
            order.addItem(item);
        }
        wallet.pay(order.getTotalAmount());
        return order;
    }
}

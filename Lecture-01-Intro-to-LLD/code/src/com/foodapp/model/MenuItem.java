package com.foodapp.model;

public class MenuItem {
    public int val = 0;
    private final String name;
    private final double price;
    private final boolean isVeg;

    public MenuItem(String name, double price, boolean isVeg) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }

    // Constructor overloading: most items on our menu are veg
    public MenuItem(String name, double price) {
        this(name, price, true);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    @Override
    public String toString() {
        return name + " (Rs " + price + ", " + (isVeg ? "veg" : "non-veg") + ")";
    }
}

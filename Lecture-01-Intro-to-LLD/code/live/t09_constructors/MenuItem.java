package t09_constructors;

class MenuItem {
    String name;
    double price;
    boolean isVeg;

    MenuItem(String name, double price, boolean isVeg) {
        // "Masala Dosa", 120, true
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }
}

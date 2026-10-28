package t11_static;

class Order {
    private static int orderCounter = 0;  //2
    private int orderId;

    Order() {
        Order.orderCounter++;
        this.orderId = orderCounter;
    }

    static int getTotalOrders() {
        return orderCounter;
    }

    int getOrderId() {
        return orderId;
    }
}

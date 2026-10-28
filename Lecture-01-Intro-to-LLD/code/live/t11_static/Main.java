package t11_static;

// Topic 4: static.
// Live: create Order.java in this folder with a static order counter.
public class Main {
    public static void main(String[] args) {
        Order first = new Order();
        Order second = new Order();

        System.out.println("First order id: " + first.getOrderId());     // 1
        System.out.println("Second order id: " + second.getOrderId());   // 2
        System.out.println("Total orders: " + Order.getTotalOrders());   // 2
    }
}

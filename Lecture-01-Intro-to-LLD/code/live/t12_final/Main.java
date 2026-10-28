package t12_final;

// Topic 5: final. Starts where topic 4 ended.
// Live: make orderId final in Order.java and add the MAX_ITEMS constant.
public class Main {
    public static void main(String[] args) {
        Order first = new Order();
        Order second = new Order();

        System.out.println("First order id: " + first.getOrderId());
        System.out.println("Second order id: " + second.getOrderId());
        System.out.println("Total orders: " + Order.getTotalOrders());
    }
}

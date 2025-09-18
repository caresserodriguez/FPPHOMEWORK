package Lesson8.Problem3;

import java.util.Objects;

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // getters/setters

    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(orderId, order.orderId);
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }


    @Override
    public int hashCode() {
        // consistent with equals
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}

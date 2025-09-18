package Lesson8.Problem3;

import java.util.Comparator;

public class ConsistComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getOrderId().compareTo(o2.getOrderId());
    }
}

package Lesson8.Problem3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        // a)  Create an ArrayList<Order>.
        ArrayList<Order> orders = new ArrayList<>();
        Order o1 = new Order("123", "Caresse", 100.00);
        Order o2 = new Order("456", "Jane", 45.79);
        Order o3 = new Order("789", "Joey", 256.44);
        Order o4 = new Order("987", "Carrie", 340.00);
        Order o5 = new Order("432", "Aadi", 23.07);

//        System.out.println("OUTPUT FOR A"); // nothing is outputted
//        for (Order o : orders){
//            System.out.println(o.toString());
//        }

        //b) add() at least five Order objects.
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);

        System.out.println("OUTPUT FOR B");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        // c) Delete an object by instance (pass an Order you previously added).
        System.out.println("\nOUTPUT FOR C");
        orders.remove(o2);
        for (Order o : orders){
            System.out.println(o.toString());
        }

        //d) Print the size of the list.
        System.out.println("\nPART D");
        System.out.println("Size of list : " + orders.size());


        //e)  Retrieve an Order by position (get(index)) and print it.
        System.out.println("\nPART E");
        System.out.println("Order at index 3 : " + orders.get(3));

        System.out.println("LIST AFTER RETRIEVAL: ");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        //f) Update the details of an Order by position (set(index, new Order(...))).
        orders.set(1, new Order("444", "Jack", 20.5));
        System.out.println("\nOUTPUT FOR F");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        //g) Override equals() in Order.java (consistent equals implementation required).
        Order o6 = new Order("123", "Caresse", 100.00);
        System.out.println("\nOUTPUT FOR G");
        System.out.println("Is equal?: " + o1.equals(o3));// false
        System.out.println("Is equal?: " + o1.equals(o6));// true
        System.out.println("CURRENT LIST: ");
        for (Order o : orders){
            System.out.println(o.toString());
        }


        //h) Sort by totalAmount (ascending) using a Comparator that’s consistent
        //with equals. Print the sorted list.
        Collections.sort(orders, new ConsistComparator());
        System.out.println("\nPART H");
        System.out.println("ORDERS SORTED BY ID IN ASCENDING ORDER");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        System.out.println("\nPART I");
        System.out.println("Orders with total > 50.0");
        List <Order> moreThan50 = new ArrayList<>(listMoreThan50(orders));
        for (Order o :moreThan50){
            System.out.println(o.toString());
        }




    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> res = new ArrayList<>();
        for (Order o : list){
            if (o.getTotalAmount() > 50.0){
                res.add(o);
            }
        }
        return res;
    }
}

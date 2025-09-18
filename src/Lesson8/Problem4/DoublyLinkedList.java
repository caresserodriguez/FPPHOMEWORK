package Lesson8.Problem4;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        //header = new Node(null);
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //Implement
        Node nn = new Node();
        nn.value = item;

        Node current = header;
        while (current.next != null){
            current = current.next;
        }
        current.next = nn;
        nn.previous = current;

    }
    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        Node current = header.next;
        while (current != null){
            if(item.equals(current.value)){
                if (current.next != null){
                    current.next.previous = current.previous;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        // Implement
        if (header.next == null) return false;
        Node first = header.next;
        Node newFirst = first.next;
        header.next = newFirst;
        if (newFirst != null) {
            newFirst.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        // Implement
        Node current = header;

        while (current.next != null) {
            current = current.next;
        }
        while (current != header) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;


        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods

        System.out.println(list.removeFirst());
        System.out.println(list);

        System.out.println(list.remove("Steve"));
        System.out.println(list);

        list.addLast("Caresse");
        list.addLast("Daniel");

        System.out.println(list);
        list.printReverse();
    }
}

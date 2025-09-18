package Lesson9.Problem2;

public class LinkedListStack {

    private class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(Integer x){
        if (x == null) return;
        Node node = new Node(x);
        node.next = top;
        top = node;
        size++;
    }

    public Integer peek(){
        return (top == null) ? null : top.data;
    }

    public Integer pop(){
        if (top == null) return null;
        Integer res = top.data;
        top = top.next;
        size--;
        return res;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack llst = new LinkedListStack();
        llst.push(1);
        llst.push(2);
        System.out.println(llst);
        System.out.println("Size = " + llst.size());
        System.out.println(llst.isEmpty());
        llst.pop();
        System.out.println(llst);
        llst.pop();
        System.out.println(llst);
    }

}

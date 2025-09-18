package Lesson9.Problem1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl(){
        arr = new Integer[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    public Integer peek() {
        if (isEmpty()) return null;
        return arr[front];
    }
    public void enqueue(int obj){
        if (size == arr.length){
            resize();
        }
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }
    public Integer dequeue() {
        if (isEmpty()) return null;
        Integer val = arr[front];
        arr[front] = null; // avoid memory leak
        front = (front + 1) % arr.length;
        size--;
        return val;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    private void resize(){
        int newCapacity = arr.length * 2;
        Integer[] newArr = new Integer[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }
    public String toString(){
 /* Return data in this format, each element separated by comma with in [ ] eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (isEmpty()) return "[ ]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % arr.length]);
            if (i != size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
package Lesson9.Problem1;

public class P1Test {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Size: " + q.size());

        // Dequeue some elements
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Queue after dequeue: " + q);

        // More enqueue to check circular behavior
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);
        q.enqueue(110); // This should trigger resize

        System.out.println("Queue after more enqueue: " + q);
        System.out.println("Size after resize: " + q.size());
    }
}

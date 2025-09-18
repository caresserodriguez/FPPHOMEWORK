package Lesson9.Problem1;

public class P1Test {
    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl();

        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.enqueue(50);

        System.out.println("Queue: " + aq);

        System.out.println("Peek: " + aq.peek());

        System.out.println("Size: " + aq.size());


        System.out.println("Dequeued: " + aq.dequeue());
        System.out.println("Dequeued: " + aq.dequeue());

        System.out.println("Queue after dequeue: " + aq);


        aq.enqueue(60);
        aq.enqueue(70);
        aq.enqueue(80);
        aq.enqueue(90);
        aq.enqueue(100);
        aq.enqueue(110);

        System.out.println("Queue after enqueue: " + aq);
        System.out.println("Size after resize: " + aq.size());
    }
}

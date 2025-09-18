package Lesson9.Problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> tq;
    private int nextId;

    public TicketingSystem() {
        this.tq = new LinkedList<>();
        this.nextId = 1 ;
    }

    public void addTicket(String description){
        Ticket newTicket = new Ticket(nextId, description);
        tq.offer(newTicket);
        nextId++;
    }

    public Ticket processTicket(){
        if (!tq.isEmpty()){
            return tq.poll();
        } else{
            System.out.println("Queue is empty. No tickets to process.");
            return null;
        }
    }

    public Ticket viewNextTicket(){
        if (!tq.isEmpty()){
            return tq.peek();
        } else{
            System.out.println("Queue is empty. No tickets.");
            return null;
        }
    }

    public boolean isEmpty(){
        return tq.isEmpty();
    }

    public int getQueueSize(){
        return tq.size();
    }


}

package Lesson9.Problem4;

public class TestP4 {
    public static void main(String[] args) {
        TicketingSystem sys = new TicketingSystem();

        sys.addTicket("Forgot Password");
        sys.addTicket("Cannot log into account");
        sys.addTicket("Website is loading slowly");

        System.out.println("Next ticket in queue" + sys.viewNextTicket());

        System.out.println("Processing tickets: ");
        while (!(sys.isEmpty())){
            Ticket processed = sys.processTicket();
            System.out.println(processed);
        }

        System.out.println("Is queue empty? " + sys.isEmpty());

        sys.addTicket("Forgot user name");
        System.out.println("Is queue empty? " + sys.isEmpty());


    }
}

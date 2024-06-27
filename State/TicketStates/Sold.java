import java.time.LocalDateTime;

/**
 * Sold è un ConcreteState
 * Sold is a ConcreteState
 */

public class Sold implements TicketStatus{
    private final String name;
    private LocalDateTime paymentDate;
    public Sold(String newName) {
       name = newName;
    }
    @Override
    public void show(){
        System.out.println("Sold name: " +name);
    }

    @Override
    public TicketStatus register(String name){
        System.out.println("Sold: you cannot change the owner, the ticket is already sold");
        return this;
    }

    @Override
    public TicketStatus pay() {
        if(paymentDate == null) {
            paymentDate = LocalDateTime.now();
            System.out.println("Sold: payment made");
        } else System.out.println("Sold: ticket already paid"); 
        return this;
    }

    @Override
    public TicketStatus delete() {
        System.out.println("Sold: ticket already sold, there will be no refund");
        return this;
    }
}

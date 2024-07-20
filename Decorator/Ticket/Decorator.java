// Decorator
public class Decorator implements Ticket{
    private final Ticket ticket;
    public Decorator (final Ticket t){
        ticket = t;
    }
    public void show(){ 
        ticket.show();
    } 
}

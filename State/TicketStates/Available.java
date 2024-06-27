/**
 * Available è un ConcreteState
 * Available is a ConcreteState
 */
public class Available implements TicketStatus{
    @Override
    public void show(){ }

    @Override
    public TicketStatus register(String name) {
        System.out.println("Available: registered ticket, status change: from available to reserved");
        return new Reserved().register(name);
    }

    @Override
    public TicketStatus pay() {
        System.out.println("Available: you cannot pay, you must first register the ticket");
        return this;
    }

    @Override
    public TicketStatus delete() {
        System.out.println("Available: ticket already available");
        return this;
    }
}

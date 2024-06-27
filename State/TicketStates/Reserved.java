/**
 * Reserved è un ConcreteState
 * Reserved is a ConcreteState
 */

public class Reserved implements TicketStatus{
    private String name;
    @Override
    public void show() { 
        System.out.println("Reserved: " + name);
    }

    @Override 
    public TicketStatus register(String newName) {
        name = newName;
        System.out.println("Reserved: reserved ticket, registered holder.");
        return this;
    }

    @Override
    public TicketStatus pay(){
        System.out.println("Reserved:  status change: from reserved to sold.");
        return new Sold(name).pay();
    }

    @Override
    public TicketStatus delete(){
        System.out.println("Reserved: status available");
        return new Available();
    }
}

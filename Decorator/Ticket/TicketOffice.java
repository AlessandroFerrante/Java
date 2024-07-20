// Creator with factoryMethod
public class TicketOffice {

    public Ticket getTicket(){
        return new StandardTicket(); 
    }

    public Ticket getDiscount(Ticket t) {
        return new Discount(t);
    }

    public Ticket format(Ticket t){
        return new Default(t);
    }
}

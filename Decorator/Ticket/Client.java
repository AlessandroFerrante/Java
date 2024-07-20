public class Client {
    
    public static void main(String[] args){ 
        
        TicketOffice office = new TicketOffice();
        
        Ticket t1 = office.getTicket();
        Ticket t2 = office.getDiscount(t1);
        Ticket t3 = office.format(t2);
          
        t1.show();
        t2.show();
        t3.show();
    }
}

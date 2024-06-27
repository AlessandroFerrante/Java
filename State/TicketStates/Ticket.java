    /**
 * Ticket è il Context. |
 * Ticket is the Context.
 */

public class Ticket {
    private String code  ="413554nDR0";
    private int price  = 100;

    private TicketStatus tStatus = new Available();

    public void show(){
        System.out.println("Price: "+price + " code: " + code);
        tStatus.show();
    }

    public void reserve(String name) {
        tStatus = tStatus.register(name);
    }

    public void buy(){
        tStatus = tStatus.pay();
    }

    public void delete(){
        tStatus = tStatus.delete();
    }
}

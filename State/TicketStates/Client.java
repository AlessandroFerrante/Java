public class Client {
    private static Ticket t  =new Ticket();
    
    public static void main(String[] args) {
        useTicket();
        incorrectUse();
    }

    private static void useTicket(){
        t.reserve("Alessandro Ferrante");
        t.buy();
        t.show();
    }
    private static void incorrectUse(){
        t.buy();
        t.delete();
        t.reserve("Mario Rossi");
    }
}

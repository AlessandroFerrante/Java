public class Client {
    private static final Products c = Shop.getCart();
    private static final Products p1 = Shop.getProd1();
    private static final Products p2 = Shop.getProd2();
    
    public static void main(String [] args){
        c.addP(p1); 
        c.addP(p1); 
        c.addP(p1); 
        c.addP(p2); 
        c.show();
    }
}

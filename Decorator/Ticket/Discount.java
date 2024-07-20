// Concrete Decorator
public class Discount extends Decorator  {
    public Discount (Ticket t) {
        super(t);
    }

    @Override
    public void show(){
        System.out.println("Ticket Discounted");
    }
}

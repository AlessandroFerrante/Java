// Concrete Decorator
public class Default extends Decorator {
    public Default(Ticket t){
        super(t);
    }
    public void show(){
        //super.show();
        System.out.println("Standard Ticket (formatted ticket)");
    }
}

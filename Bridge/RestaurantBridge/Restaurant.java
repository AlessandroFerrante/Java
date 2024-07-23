// Abstraction
public abstract class Restaurant {

    protected Pasta pasta;

    protected Restaurant(Pasta pasta) {
        this.pasta = pasta;
    }
    // added method to request another type of pastaw
    protected void request(Pasta pasta) {
        this.pasta = pasta;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void addCookingType();

    public void serveDish() {
        addCookingType();
        addSauce();
        addToppings();
        pasta.prepare();
        pasta.qualityCheck();
        System.out.println("Order in Progress!");
    }

}
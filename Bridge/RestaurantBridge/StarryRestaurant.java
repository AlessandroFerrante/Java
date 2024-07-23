//  Refined Abstraction
public class StarryRestaurant extends Restaurant {

    public StarryRestaurant(Pasta pasta) {
        super(pasta);
    }
    // added method to request another type of pasta
    protected void request(Pasta pasta) {
        super.request(pasta);
    }

    @Override
    public void addToppings() {
        pasta.setToppings("Parmesan Cheese");
    }

    @Override
    public void addSauce() {
        pasta.setSauce("Basil and pine nut pesto");
    }

    @Override
    public void addCookingType() {
        pasta.setCookingType("Al dente");
    }

}
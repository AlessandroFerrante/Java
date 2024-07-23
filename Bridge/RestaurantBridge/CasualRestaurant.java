// Refined Abstraction
public class CasualRestaurant extends Restaurant {

    public CasualRestaurant(Pasta pasta) {
        super(pasta);
    }
    // added method to request another type of pasta
    protected void request(Pasta pasta) {
        super.request(pasta);
    }

    @Override
    public void addToppings() {
        pasta.setToppings("sliced bacon, salad ricotta, fried striped onion");
    }

    @Override
    public void addSauce() {
        pasta.setSauce("Basil and almond pesto");
    }

    @Override
    public void addCookingType() {
        pasta.setCookingType("Well cooked");
    }

}
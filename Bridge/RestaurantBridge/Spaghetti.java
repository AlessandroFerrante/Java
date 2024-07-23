// Concrete Implementor
public class Spaghetti extends Pasta  {
    private String toppings;
    private String sauce;
    private String cookingType;
    
    @Override
    public void prepare() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding type of cooking: " + cookingType);
    }

    @Override
    public void qualityCheck() {
        System.out.println("Type of cooking: " + cookingType);
    }

    @Override
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setCookingType(String cookingType) {
        this.cookingType = cookingType;
    }
}

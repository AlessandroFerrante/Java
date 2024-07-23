// Implementor
public abstract class Pasta {

    protected String sauce;
    protected String toppings;
    protected String cookingType;

    public abstract void prepare();
    public abstract void qualityCheck();
    public abstract void  setToppings(String toppings);
    public abstract void  setSauce(String sauce);
    public abstract void  setCookingType(String cookingType);
    
}
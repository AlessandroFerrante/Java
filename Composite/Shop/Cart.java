import java.util.ArrayList;
import java.util.List;
// Composite
public class Cart implements Products{
    private List<Products> cart = new ArrayList<>(); 

    public void show() {
        System.out.println("Price: " + getPrice() + " Weight: "  + getWeight());
    }

    public float getPrice() {
        return cart.stream().map(p -> p.getPrice()).reduce(0f, Float::sum);
    }
    public float getWeight() {
        return cart.stream().map(p-> p.getWeight()).reduce(0f, Float::sum);
    }

    public void addP(Products p){
        cart.add(p);
    }
    public void removeP(Products p){
        cart.remove(p);
    } 
}

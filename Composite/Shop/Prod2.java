// Leaf
public class Prod2 implements Products{
    private float price;
    private float weight;

    public Prod2(float p, float w) {
		price = p;
		weight = w;
	}

    public void show() {
        System.out.println("Price: " + getPrice() + " Weight: "  + getWeight());
    }

    public float getPrice() {
        return price;
    }
    public float getWeight() {
        return weight;
    }

    public void addP(Products p){}
    public void removeP(Products p){}
}

/**
 * ConcreteProduct
 */
public class Truck implements Transport{
    @Override
    public float delivery(float km){
        System.out.println("Truk: delivering by road...");
        float d = distance(km);  
        return d;      
    }
    
    @Override
    public void loadCargo() {
        System.out.println("Truck: Loading cargo onto the truck...");
    }
    
    @Override
    public int capacity(int kg){
        System.out.println("Capacity: " + kg + "kg");
        return kg;
    }

    @Override
    public void unloadCargo() {
        System.out.println("Truck: Unloading cargo from the truck...");
    }

    private float distance(float km) {
        float Km = km;
        for(int i = 0; i < Km; i++) {
            System.out.print("=");        
        }
        System.out.print("📍🚛\n");
        return Km;
    }
}

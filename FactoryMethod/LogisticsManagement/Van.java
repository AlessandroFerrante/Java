/**
 * ConcreteProduct
 */
public class Van implements Transport {
    @Override
    public float delivery(float km) {
        System.out.println("Van: delivering by road...");
        float d = distance(km);
        return d;
    }
    private float distance(float km) {
        float Km = km;
        for(int i = 0; i < Km; i++) {
            System.out.print("=");        
        }
        System.out.print("🚚📍\n");
        return Km;
    }
    @Override
    public void loadCargo() {
        System.out.println("Van: Loading cargo into the van...");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Van: Unloading cargo from the van...");
    }

    @Override
    public int capacity(int kg){
        System.out.println("Capacity: " + kg + "kg");
        return kg;
    }
}

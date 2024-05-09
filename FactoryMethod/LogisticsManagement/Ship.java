/**
 * ConcreteProduct
 */
public class Ship implements Transport{
    @Override
    public float delivery(float Mn){
        System.out.println("Ship: delivering via sea!");
        float n = navigate(Mn);
        return n;
    }

    @Override
    public int capacity(int kg){
        System.out.println("Capacity: " + kg + "kg");
        return kg;
    }

    @Override
    public void loadCargo(){
        setSail();
    }
    
    @Override
    public void unloadCargo(){
        dock();
        dropsAnchor();
    }

    private void setSail() {
        System.out.println("Ship: Setting sail...");
    }

    private float navigate(float mn){
        float Mn = mn;
        System.out.print("\n");
        for(int i = 0; i < Mn; i++) {
            System.out.print("~");        
        }
        return Mn;
    }
    private void dock() {
        System.out.print("🚢📍\n");
        System.out.println("Ship: Docking at port...");
    }

    private void dropsAnchor(){
        System.out.println("Ship:⚓🌊");
    }
}

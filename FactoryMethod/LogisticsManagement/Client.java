public class Client {
    public static void main(String[] args) {
        
        Logistics logistics = new RoadLogistics();
        Logistics logistics2 = new SeaLogistics();
        
        Transport t = logistics.planDelivery("truck");
        
        float km= 0;
        int kg = 0;
        t.loadCargo();
        kg += t.capacity(5000);
        km = t.delivery(100);
        t.unloadCargo();
        t.loadCargo();
        kg += t.capacity(4000);
        km += t.delivery(11);
        t.unloadCargo();
        km += t.delivery(25);
        t.unloadCargo();
        System.out.println("Kilometers traveled by the truck: " + km);
        System.out.println("Total kilograms transported : " + kg);
        kg = t.capacity(0);

        Transport t2 = logistics2.planDelivery("ship");
        float Mn = 0;
        int kg2 = 0;
        t2.loadCargo();
        kg2 += t2.capacity(30000);
        Mn += t2.delivery(10000);
        t2.unloadCargo();
        t2.capacity(0);
        t2.loadCargo();
        kg2 += t2.capacity(16250); 
        Mn += t2.delivery(6000);
        t2.unloadCargo();
        t2.capacity(0);
        System.out.println("Nautical miles traveled by the ship: " + Mn);
        System.out.println("Total kilograms transported : " + kg2);

    }
}

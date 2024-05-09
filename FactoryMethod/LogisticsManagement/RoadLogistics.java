/**
 * ConcreteCreator
 */
public class RoadLogistics extends Logistics {
    
    public Transport createTransport(String transport){
        switch (transport) {
            case "truck":
                Transport truck = new Truck();  
                return truck;
            case "van": 
                Transport van = new Van();                 
                return van;
            default:
                return null;
        }
    }    
}

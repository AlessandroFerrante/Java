/**
 * ConcreteCreator
 */
public class SeaLogistics extends Logistics {
    
    public Transport createTransport(String transport){
        switch (transport) {
            case "ship":
                Transport ship = new Ship();
                return ship;
            default:
                return null;
        }
    }
}

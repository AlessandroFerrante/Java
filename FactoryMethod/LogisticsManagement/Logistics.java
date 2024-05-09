/**
 * Creator
 */
public abstract class Logistics {
    
    public abstract Transport createTransport(String t);

    public Transport planDelivery(String transport){
        Transport t = createTransport(transport);
        if(t == null) {
            System.out.println("Trasporto non selezionato");
            return null;
        }
        return t;
    }
    
}

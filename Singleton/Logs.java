import java.util.ArrayList;
import java.util.List;

/**
 * @implSpec
 * La classe Logs rappresenta una classe Singleton per gestire la singola istanza della classe Fib |
 * The Logs class represents a Singleton class to handle the single instance of the Fib class
 * 
 * La classe implementa un metodo statico ("getInstance") per ottenere l'istanza univoca
 * e mantiene un riferimento statico all'istanza univoca. |
 * The class implements a static method ('getInstance') to get the unique instance 
 * and maintains a static reference to the unique instance.
 * 
 * Questo metodo restituisce sempre la singola istanza della classe Fib. |
 * This method always returns the single instance of the Fib class.
 * @see Logs#getIstance()
 * @serialData L'oggetto serializzato è una singola istanza di Logs. |
 *             The serialized object is a single instance of Logs.
 * 
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-08
 */

public class Logs {
    /**
     * @param obj contiene l'unica istanza di Fib |
     *            contains the only instance of Fib
     * @param l lista contenente i dati di tracciamento da registrare |
     *          list containing the tracing data to record
     */
    private static Logs obj;
    private List<String> l;

    /**
     * @implSpec 
     * Costruttore privato utilizzato per impedire che nuove istanze
     * della classe Logs vengano create dall'esterno. |
     * Private constructor used to prevent new instances 
     * of the Logs class from being created from outside.
     */
    private Logs() {
        empty();
    }

    /**
     * @implSpec
     * Questo metodo restituisce sempre la singola istanza della classe Logs. |
     * This method always returns the single instance of the Logs class.
     * 
     * @return obj l'unica istanza della classe Logs |
    *          obj the only instance of the Logs class
     */
    public static Logs getIstance(){
        if(null == obj)
            obj = new Logs();
        return obj;
    }

    /**
     * Aggiunge il nuovo parametro
     * Adds the new parameter
     * 
     * @param s nuovo dato da aggiungere all'elenco
     *          new data to add to the list
     */
    public void record(String s) {
        l.add(s);
    }

    /**
     * @implSpec
     * ll.size() - 1 ti permette di "calcolare" l'ultima posizione |
     *             allows you to "calculate" the last position
     * l.get() ottiene i dati con l'indice restituito da l.size()-1 |
     *         gets the data with the index returned by l.size()-1
     * 
     * @return gli ultimi dati registrati |
     *         the last recorded data
     */
    public String dumpLast() {
        return l.get(l.size() - 1);
    }

    /**
     * @implNote
     * scorre l'elenco con un for avanzato per,
     * concatenare tutto in una stringa |
     * iterates through the list with an advanced for, 
     * concatenating everything into a string
     * 
     * @return acc stringa contenente tutti i dati di tracciamento nell'elenco |
     *             string containing all tracing data in the list
     */
    public String dumpAll() {
        String acc = "";
        for(String s : l)
            acc = acc.concat(s);
        return acc;
    }

    /**
     * @implNote
     * cancella l'elenco dei dati di tracciamento |
     * clears the list of tracing data
     */
    public void empty() {
        l = new ArrayList<>();
    }
}

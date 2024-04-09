/**
 * @implSpec
 * La classe Fib rappresenta una classe Singleton per gestire la singola istanza della classe Fib.
 * The Fib class represents a Singleton class to handle the single instance of the Fib class.
 * 
 * La classe implementa un metodo statico ("getInstance") per ottenere l'istanza univoca
 * e mantiene un riferimento statico all'istanza univoca.
 * The class implements a static method ('getInstance') to get the unique instance 
 * and maintains a static reference to the unique instance.
 * 
 * Questo metodo restituisce sempre la singola istanza della classe Fib.
 * This method always returns the single instance of the Fib class.
 * @see Fib#getIstance()
 * @serialData L'oggetto serializzato è una singola istanza di Fib.
 *             The serialized object is a single instance of Fib.
 * 
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-06
 */

public class Fib {
    /**
     * @param obj contains the only instance of Fib. 
     *            contiene l'unica istanza di Fib
     */
    private static final Fib obj = new Fib();

    private final int[] values = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
    private int i;
    
    /**
     * @implSpec 
     * Costruttore privato utilizzato per impedire che nuove istanze
     * della classe Fib vengano create dall'esterno.
     * Private constructor used to prevent new instances 
     * of the Fib class from being created from outside.
     */
    private Fib() {
        i = 3;
    }
    /**
     * @implSpec
     * Questo metodo restituisce sempre la singola istanza della classe Fib.
     * This method always returns the single instance of the Fib class.
     * 
     * @return obj l'unica istanza della classe Fib
     *         obj the only instance of the Fib class
     */
    public static Fib getInstance(){
        return obj;
    }
    
    /**
     * @implNote 
     * il valore successivo nell'elenco
     * returns the values ​​contained in the list
     * 
     * @return il valore successivo nell'elenco
     *         the next value in the list
     */
    public int getValue() {
        if (i < 11)
            i++;
        return values[i - 1];
    }
    /**
     * @implNote
     * Riavvia dal primo elemento dell'elenco
     * Restarts from the first item in the list
     */ 
    public void revert() {
        i = 0;
    }

}

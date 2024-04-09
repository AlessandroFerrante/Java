/**
 * @implNote
 * Main della classe Fib
 * Main of the Fib class
 * 
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-08
 */

public class MainFib {
    public static void main(String[] args) {
        Fib f = Fib.getInstance();
        System.out.print("f " + f.getValue());
        System.out.println(" " + f.getValue());

        Fib f2 = Fib.getInstance();
        System.out.print("f2 " + f2.getValue());
        System.out.println(" " + f.getValue());
        
        Fib f3 = Fib.getInstance();
        System.out.print("f3 " + f3.getValue());
        System.out.println(" " + f.getValue());

        Fib f4 = Fib.getInstance();
        System.out.print("f4 " + f4.getValue());
        System.out.println(" " + f.getValue());
        
        /**
         * @implSpec 
         * Il costruttore non è accessibile perché è privato
         * Ottieni un errore in fase di compilazione con:
         * The constructor is not accessible because it is private
         * You get a compile-time error with:
         */
        // Fib f3 = (Fib) f2.clone();
        // Fib f4 = new Fib(); 
    }
}

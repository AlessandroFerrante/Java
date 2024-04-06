import java.io.IOException;

/**
 * Class that contains the main and which starts the calculation operations
 * 
 * @author Alessandro Ferrante
 * @version 1.0
 * @since 2024-04-05
*/

public class ClientPay {
    
    public static void main(final String[] args) {
        Payments p = new Payments();
        p.clear();
        try { 
            p.readFile("./", "Amounts.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.converted();
        p.calculateSum();
        p.calculateMax();
        System.out.println("Dimens: " + p.getDimens());
        System.out.println("Max: " + p.getMax());
        System.out.println("Total: " + p.getSum());
    }
}

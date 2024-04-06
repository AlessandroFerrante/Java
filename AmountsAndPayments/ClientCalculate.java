/** 
 * Class that contains the main and that starts the calculation operations
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-05
*/

import java.io.IOException;

public class ClientCalculate {
    private final CalculationAmounts ci = new CalculationAmounts();
    private final CalculationAmounts2 ci2 = new CalculationAmounts2();
    private float r = 0;
    private float max = 0;

    public static void main(final String[] args){
        final ClientCalculate c = new ClientCalculate();
        c.runCalculations();
    }

    public void runCalculations() {
        // for any exceptions
        try{
            r = ci.calculate("./", "Amounts.csv");
            max = ci2.calculate("./", "Amounts.csv");
        } catch (final IOException e) {
            e.printStackTrace(); // prints the stack trace of an exception
        }
        System.out.println("Total: " + r);
        System.out.println("Max : " + max);
                
    } 
}
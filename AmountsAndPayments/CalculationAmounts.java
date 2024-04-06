/**
 * Read from the file, calculate the total amounts
 * 
 * @author Alessandro Ferrante
 * @version 1.0
 * @since 2024-04-05
*/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class CalculationAmounts {
    private final List<String> amounts = new ArrayList<>(); // List is an interface, ArrayList is an implementation of List
    private float total;
    
    /**
     * reads the values and adds them and calculation of the total
     * 
     * @param c folder name
     * @param n file name
     * @return total values
     * @throws IOException
     */
    public float calculate(final String c, final String n) throws IOException{
        final LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        
        total = 0;
        while (true) {
            final String row = f.readLine(); // reads a line from the file
            if(null == row)
                break; 
            amounts.add(row); // add to list
            total += Float.parseFloat(row); // converts String to float
        }
        f.close();
        return total;
    }
}
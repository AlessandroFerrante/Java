import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * Read from the file, calculate the total amounts and find the maximum amount
 * 
 * @author Alessando Ferrante
 * @version 2.0
 * @since 2024-04-05
 */

public class CalculationAmounts2 {
    private List<String> amounts = new ArrayList<String>();
    private float total, max;

    /**
     * reads the values, finds the maximum and adds them
     * 
     * @param c folder name
     * @param n file name
     * @return total values or max value
     * @throws IOException
     */
    public float calculate(String c, String n) throws IOException{
        // variable for reading the file
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        String row;

        while (true) {
            row =  f.readLine();
            if (row == null)
                break;
            if(!amounts.contains(row))
                amounts.add(row);
        }
        f.close();

        // calculation of the total
        total = 0;
        for(int i = 0; i < amounts.size(); i++){
            total += Float.parseFloat(amounts.get(i));
        }

        // estraction of the max value
        max = Float.parseFloat(amounts.get(0));
        for(int i = 0; i < amounts.size(); i++){
            if(max < Float.parseFloat(amounts.get(i)));
            max = Float.parseFloat(amounts.get(i));
        }

        //return total;
        return max;
    }   
}

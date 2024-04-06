import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that reads a list of amounts from the file, 
 * and provides granular methods for calculating the total and maximum
 * 
 * @author Alessandro Ferrante
 * @version 1.0
 * @since 2024-04-05
*/


public class Payments {
    /**
     * @param amountsRead list of read values ​​stored in strings
     * @param values list of values ​​converted to float
     */
    private List<String> amountsRead = new ArrayList<>();
    private List<Float> values = new ArrayList<>();
    private float total;
    private float max;

    /**
     * Reads the file line by line and fills a list
     * 
     * @param c file path
     * @param n file name
     * @throws IOException
     */
    public void readFile(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        String row;
        while (true) {
            row = f.readLine();
            if (row == null)
                break;
            insert(row);
        }
        f.close();
    }

    /**
     * adds values ​​to the list that aren't already there
     * 
     * @param value value to add to the list 
     */
    public void insert(String value) {
        if (!amountsRead.contains(value))
            amountsRead.add(value);
    }

    /**
     * @param amounts used in for loop that each value in amountsRead converts it and adds it to list
     */
    public void converted() {
        for(String amounts: amountsRead)
            values.add(Float.parseFloat(amounts));
    }

    public void calculateSum() {
        total = 0;
        for (float v : values)
            total += v;
    }

    public void calculateMax() {
        max = values.get(0);
        for (float v : values){
             if (max < v)
                max = v;
        }
    }

    /** resets to initial values */
    public void clear() {
        amountsRead = new ArrayList<>();
         values = new  ArrayList<>();
         total = 0;
         max = 0;
    }

    public float getMax(){
        return max;
    }

    public float getSum() {
        return total;
    }

   /** returns the number of values ​​present in the list */
    public int getDimens() {
        return amountsRead.size();
    }

    /** returns the element of the respective index */
    public String getItems(int index) {
        return amountsRead.get(index);
    }
}
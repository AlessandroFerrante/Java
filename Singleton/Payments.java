import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe che legge dal file, che rappresenta un elenco di importi e fornisce metodi
 * granulari per il calcolo del valore totale e del massimo.
 * Svolge il ruolo di Multi-ton.
 * Class that reads from file, represents a list of amounts, and provides methods
 * granular for calculating the total and maximum value. 
 * It plays the role of Multi-ton.
 * 
 * @author Alessandro Ferrante
 * @version 1.4
 * @since 2024-04-05
*/

public class Payments {
    /**
     * @param amountsRead lista dei valori letti memorizzati in stringhe | list of read values ​​stored in strings
     * @param values lista dei valori convertiti in float | list of values ​​converted to float
     */
    private List<String> amountsRead = new ArrayList<>();
    private List<Float> values = new ArrayList<>();
    private float total, max;

    private static int numberInstance = 0;
    
    /**
     * @implSpec 
     * Costruttore privato utilizzato per impedire CHE nuove istanze
     * della classe Logs vengano create dall'esterno. |
     * Private constructor used to prevent new instances 
     * of the Logs class from being created from outside.
     */
    Payments() {
    }
    /**
     * 
     * @return massimo 10 istanze o null |
     *         max 10 instance or null
     */
    public static Payments getInstance() {
        if (numberInstance < 10) {
            numberInstance++;
            return new Payments();
        }
        return null;
    }
    /**
     * @implNote
     * Legge il file riga per riga e riempie un elenco |
     * Reads the file line by line and fills a list
     * 
     * @param c percorso file | file path
     * @param n nome file | file name
     * @throws IOException
     */
    public void readFile(String c, String n) throws IOException{
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
        String row;
        while(true) {
            row = f.readLine();
            if (row == null)
                break;
            insert(row);
        }
        f.close();
    }

    /**
     * @implNote
     * aggiunge valori all'elenco che non sono già presenti |
     * adds values ​​to the list that aren't already there
     * 
     * @param value valore da aggiungere alla lista |
     *              value to add to the list                  
     */
    public void insert(String value) {
        if(!amountsRead.contains(value));
            amountsRead.add(value);
    }

    /**
     * @param amount utilizzato nel ciclo for in cui ogni valore in amountRead lo converte e lo aggiunge all'elenco |
     *               used in for loop that each value in amountsRead converts it and adds it to list
     */
    public void converted() {
        for(String amount : amountsRead)
            values.add(Float.parseFloat(amount));
    }

    public void calculateSum() {
        total = 0;
        for(float v : values)
            total += v;
    }

    public void calculateMax() {
        max = values.get(0);
        for(float v : values)
            if(max < v) 
                max = v;
    }
    /** 
     * @implNote
     * ripristina i valori iniziali |
     * resets to initial values 
     */
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
    /** 
     * @implNote
     * restituisce il numero di valori presenti nella lista |
     * returns the number of values ​​present in the list 
    */
    public int getDimens() {
        return amountsRead.size();
    }

    /** 
     * @implNote
     * restituisce l'elemento del rispettivo indice |
     * returns the element of the respective index 
     * 
    */
    public String getItems(int index) {
        return amountsRead.get(index);
    }
}
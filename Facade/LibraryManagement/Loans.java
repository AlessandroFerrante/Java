import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe del sottosistema,
 * Loans tiene un HashMap dei libri prestati 
 * con chiave(nome del Socio) e valore(lista dei libri in prestito). |
 * Subsystem class,
 * Loans keeps a HashMap of the books lent 
 * with key (member name) and value (list of books on loan).
 */

public class Loans {
    /**
     * @param loansTable tabella dei presititi: la chiave è il nome della persona,
     *                   il valore è una lista in cui sono contenuti i titoli dei libri presi in prestito |
     *                   loans table: the key is the person's name, 
     *                   the value is a list containing the titles of the books borrowed.
     */
    private Map< String, List<String>> loansTable = new HashMap<>();

    public void register(String namePartner, String titleBook) {
        System.out.println("Loans: take the book");
        if (loansTable.containsKey(namePartner))
            loansTable.get(namePartner).add(titleBook);
        else {
            List<String> booksLoan = new ArrayList<>();
            booksLoan.add(titleBook);
            loansTable.put(namePartner, booksLoan);
        }
    }

    public String foundPerson(String titleBook) {
        System.out.println("Loans: found person");
        for (String s: loansTable.keySet())
            if (loansTable.get(s).contains(titleBook)) return s;
        return null;
    }
}

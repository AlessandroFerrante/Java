import java.util.Arrays;
import java.util.List;

/**
 * Classe del sottosistema
 * Permissions implementa le regole per la convalida dei prestiti e delle letture dei libri.
 * Subsystem class
 * Permissions implements rules for validating book loans and readings.
 */

public class Permissions {
    /**
     * @param reading autorizzati alla lettura | authorized to read
     * @param laon autorizzati ai prestiti | authorized for loans
     */
    private final List< String > reading = Arrays.asList("Alan", "Brian", "Claire", "Dan"); 
    private final List< String > loan = Arrays.asList("Alan", "Brian");

    /**
     * 
     * @param personName nome della persona che desidera leggere | name of the person who wishes to read
     * @return vero o falso, risultato della verifica | true or false, verification result.
     */
    public boolean ifLegible(String personName) {
        System.out.println("Permissions: check reading rule");
        return reading.contains(personName);
    }
    /**
     * 
     * @param personName nome della persona che richiede il prestito | name of the person requesting the loan
     * @return vero o falso, risultato della verifica | true or false, verification result.
     */
    public boolean ifLoanable(String personName) {
        System.out.println("Loans: check the loan rules");
        return loan.contains(personName);
    }
}

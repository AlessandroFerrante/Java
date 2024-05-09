import java.util.HashMap;
/**
 * @implNote
 * Il ConcreteCreator fornisce istanze che rappresentano studenti. |
 * The ConcreteCreator provides instances that represent students.
 */
public class ConcreteCreator extends Creator{
    private static boolean active = true;
    
    /**
     * @implNote 
     * Tiene la corrispondenza tra istanza di Suspended e l'istanza di studente. |
     * Maintains the correspondence between the Suspended instance and the student instance.
     */
    private static HashMap<Suspended, IStudent> blocked = new HashMap<>();
    
    /**
     * @implSpec
     * implementazione del Factory Method che restituisce una istanza. |
     * implementation of Factory Method that returns an instance.
     */
    @Override
    public IStudent getStudent() {
        if(active)
            return new Student();
        return new Suspended(0);
    }

    /**
     * @implNote
     * Ritorna uno studente sospeso che non può sostenere esami. |
     * A suspended student who cannot take exams returns.
     * @return sosp studente sospeso. |
     *              suspended student
     */
    @Override
    public IStudent suspended(IStudent s) {
        Suspended sosp = new Suspended(s.getAverage());
        blocked.put(sosp, s);
        return sosp;
    }

    /**
     * @implNote
     * Restituisce uno studente sospeso rimuovendo la sospensione, può sostenere esami. |
     * Returns a suspended student by removing the suspension, can take exams.
     */
    public IStudent restore(IStudent s){
        return blocked.remove(s);
    }
}

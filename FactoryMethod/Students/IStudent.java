/**
 * @implNote
 * IStudent svolge il ruolo di Product e rappresenta uno studente. |
 * IStudent plays the role of Product and represents a student.
 */
public interface IStudent {
    
    /**
     * @implNote
     * Registra un nuovo esame, se possibile. |
     * Register a new exam, if possible.
     * 
     * @param m nome materia | matter name
     * @param g voto esame | exam grade
     */
    public void newExam(String m, int g);
    
    /**
     * @implNote
     * Calcola e restituisce la media dei degli esami. |
     * Calculates and returns the average of the exams.
     * 
     * @return media esami | exam average.
     */
    public float getAverage();
}

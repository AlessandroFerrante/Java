/**
 * @implNote
 * Suspended svolge il ruolo di `ConcreteCreator` e rappresenta uno studente sospeso. |
 * Suspended plays the role of `ConcreteCreator` and represents a suspended student.
 */
public class Suspended implements IStudent {
    private float average;

    /**
     * @implNote
     * Prende il valore della media degli esami sostenuti. |
     * It takes the value of the average of the exams taken.
     * @param a media voti esami. |
     *          average exam grades.
     */
    public Suspended(float a) {
        average = a;
    }

    /**
     * @implNote
     * Override del metodo `newExam` della classe IStudent, indica che l'esame non può essere registrato. |
     * Override of the `newExam` method of the IStudent class, indicates that the exam cannot be recorded.
     */
    @Override
    public void newExam(String m, int g) {
        System.out.println("It is not possible to take exams");
    }
    
    /**
     * @implNote
     * Override del metodo `getAverage` della classe IStudent, restituisce la media. |
     * Override of the `getAverage` method of the IStudent class, returns the average.
     */
    @Override
    public float getAverage() {
        return average;
    }

    
    
}

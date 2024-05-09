/**
 * @implNote
 * Classe Client che richiama alcune operazioni su uno studente. |
 * Client class that invokes some operations on a student.
 */
public class Client {
    private IStudent s;
    private Creator creat;
    
    public Client(Creator c) {
        creat = c;
    }


    public void registerExam() {
        s = creat.createStudent();
        s.newExam("Maths", 30);
    }

    /**
     * Registra un esame, sospende la carriera, riprende la carriera, e registra un esame.
     * Record an exam, pause your career, resume your career, and record an exam.
     */
    public void sequenceOperations() {
        s.newExam("English", 7);
        s.getAverage();

        System.out.println("*Career suspension*");
        s = creat.suspended(s);
        System.out.println("try recording an exam");
        s.newExam("History", 8);
        s.getAverage();

        System.out.println("*Career recovery*");
        s = creat.restore(s);
        System.out.println("try recording an exam");
        s.newExam("History", 8);
        s.getAverage();
    }

    public IStudent get() {
        return s;
    }
}

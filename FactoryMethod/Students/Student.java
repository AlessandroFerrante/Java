/**
 * @implNote
 * Suspended svolge il ruolo di `ConcreteProduct` e rappresenta uno studente sospeso. |
 * Suspended plays the role of `ConcreteProduct` and represents a suspended student.
 */

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent{
    private List<Exam> exams = new ArrayList<>();
    
    /**
     * @implNote
     * Override del metodo `newExam` della classe IStudent, registra un nuovo esame. |
     * Override of the `newExam` method of the IStudent class, register a new exam.
     * 
     * @param m nome materia | matter name
     * @param g voto esame | exam grade
     */
    @Override
    public void newExam(String m, int g){
        //Exam e = new Exam(m, g);
        //exams.add(e);
        exams.add(new Exam(m, g));
        System.out.println("Exam " + m + " Registered");   
    }
    @Override
    public float getAverage() {
        System.out.println("Number of exams: " + exams.size());
        if (exams.isEmpty())
            return 0;
        float sum = 0;
        for(Exam e : exams)
            sum += e.grade();
        float average = sum / exams.size();
        System.out.println("<Avarage>: " + average);
        return average;
    }    

}

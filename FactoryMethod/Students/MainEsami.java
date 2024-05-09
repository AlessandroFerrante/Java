/**
 * Classe con metodo main
 */

public class MainEsami {
    public static void main(String[] args) {
        Creator crea = new ConcreteCreator();
        Client c = new Client(crea);
        c.registerExam();
        c.sequenceOperations();

        IStudent s1 = c.get();
        s1.newExam("Geo", 9);
        s1.getAverage();

        IStudent s2 = crea.createStudent();
        s2.newExam("Italian", 10);
        s2.getAverage();
        System.out.println("num instances " + crea.getNum());
    }
}

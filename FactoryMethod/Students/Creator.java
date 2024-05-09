/**
 * Classe che rappresenta il Creator
 */
public abstract class Creator {
    private int numInstance = 0;

    /**
     * @implSpec
     * Dichiarazione di un metodo astratto, che verrà implementato da ConcreteCreator. |
     * Declaration of an abstract method, which will be implemented by ConcreteCreator.
     */
    public abstract IStudent getStudent();

    public IStudent createStudent() {
        numInstance++;
        return getStudent();
    }

    public int getNum() {
        return numInstance;
    }

    public abstract IStudent restore(IStudent s);
    public abstract IStudent suspended(IStudent s);
}

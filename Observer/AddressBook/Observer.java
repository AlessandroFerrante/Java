// Observer interface
public interface Observer {
    // Method called by the Subject to notify a change
    public void update(Subject s, Object o);
}

import java.util.ArrayList;
import java.util.List;

// Subject Class 
public class Subject {
    private List<Observer> obs = new ArrayList<>(); // List of observers
    private boolean changed = false; // Flag indicating whether there has been a change

    // Notify observers if there has been a change
    public void notify(Object state) {
        if (!changed) return; //If there hasn't been a change, it exits
        for (Observer o : obs) {
            o.update(this, state); // Call the update method on each observer
        }
        changed = false; // Reset the flag changed
    }

    // Sets the changed flag to true
    public void setChanged() {
        changed = true;
    }

    // Adds an observer to the list
    public void attach(Observer o) {
        obs.add(o);
    }

    // Removes an observer from the list
    public void detach(Observer o) {
        obs.remove(o);
    }
}

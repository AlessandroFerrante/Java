import java.util.ArrayList;
import java.util.List;
// Concrete Subject
// AddrBook class that extends Subject
public class AddrBook extends Subject {
    private List<Person> name = new ArrayList<>(); // List of people

    // Inserts a new person into the list
    public void insert(Person p) {
        if (name.contains(p)) return; //If the person is already on the list, he or she leaves
        name.add(p);
        setChanged(); // Set that there has been a change
        notify(name); // Notify watchers with updated list
    }

    //Find a person by last name
    public Person find(String lastname) {
        for (Person p : name) {
            if (p.getLastname().equals(lastname)) return p;
        }
        System.out.println("AddrBook.find: NOT found");
        return null; //Returns null if it does not find the person
    }
}

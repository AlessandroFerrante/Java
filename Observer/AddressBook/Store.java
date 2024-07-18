import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
// Concrete Observer
// Store class that implements Observer
public class Store implements Observer {
    @Override
    public void update(Subject s, Object ob) {
        @SuppressWarnings("unchecked")
        List<Person> l = (List<Person>) ob ; // Cast the state object to List<Person>
        String nm;
        try (FileWriter f = new FileWriter("name.txt")) {
            for (Person p : l) {
                nm = p.getName() + "\t" + p.getLastname() + "\t" + p.getPhone() + "\t" + p.getCity();
                f.write(nm + "\n"); // Writes the person's information to the file
            }
        } catch (IOException e) {
            e.printStackTrace(); // Exception handling
        }
    }
}
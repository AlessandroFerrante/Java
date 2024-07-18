// Dialog class to test the implementation
public class Dialog {
    public static void main(String[] args) {
        AddrBook abook = new AddrBook(); // Create an AddrBook object
        Store st = new Store(); // Create a Store object
        Person p1 = new Person("Oliver", "Stone", "012345", "NY"); // Create a new person

        abook.attach(st); // Register the Store as an AddrBook observer
        abook.insert(p1); // Insert a person into the AddrBook
    }
}
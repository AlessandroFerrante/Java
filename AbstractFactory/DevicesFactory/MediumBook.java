import java.time.LocalDateTime;
/**
 * Product
 */
public class MediumBook implements Laptop {
    public void powerOn() {
        System.out.println("Turning on computer...");
    }

    private LocalDateTime time = LocalDateTime.now();
    public void displayInfo() {
        System.out.println("Welcome to a Medium Book\n \t " +time);
    }
}

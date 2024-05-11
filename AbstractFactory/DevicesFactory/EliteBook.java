import java.time.LocalDateTime;
/**
 * Product
 */
public class EliteBook implements Laptop {
    public void powerOn() {
        System.out.println("Turning on computer...");
    }

    private LocalDateTime time = LocalDateTime.now();
    public void displayInfo() {
        System.out.println("Welcome to an Elite Book\n \t " +time);
    }
}

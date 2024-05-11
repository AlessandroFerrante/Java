import java.time.LocalDateTime;
/**
 * Product
 */
public class MediumTab implements Tablet {
    public void powerOn() {
        System.out.println("Turning on tablet...");
    }

    private LocalDateTime time = LocalDateTime.now();
    public void displayInfo() {
        System.out.println("Welcome to a Medium Tab\n \t " +time);
    }
}

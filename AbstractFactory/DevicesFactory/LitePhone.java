import java.time.LocalDateTime;
/**
 * Product
 */
public class LitePhone implements Smartphone {
    public void powerOn() {
        System.out.println("Turning on smartphone...");
    }

    private LocalDateTime time = LocalDateTime.now();
    public void displayInfo() {
        System.out.println("Welcome to a Lite Phone\n \t " +time);
    }
}

import java.util.Scanner;

/**
 * Hub is the CLient.
 */
public class Hub {
    private DevicesFactory devices;

    public Hub(String deviceType) {
        switch (deviceType) {
            case "Elite":
                devices = new EliteFactory();
                break;
            case "elite":
                devices = new EliteFactory();
                break;
            case "Medium":
                devices = new MediumFactory();
                break;
            case "medium":
                devices = new MediumFactory();
                break;
            case "Lite":
                devices = new LiteFactory();
                break;            
            case "lite":
                devices = new LiteFactory();
                break;
            default:
                throw new IllegalArgumentException("Unsupported  device type: "+ deviceType + "Insert: elite, medium or lite");
        }
    }

    public Laptop createBook() {
        Laptop book = devices.createLaptop();
        return book;
    }

    public Smartphone createPhone() {
        Smartphone smartphone = devices.createSmartphone();
        return smartphone;
    }

    public Tablet createTab() {
        Tablet tab = devices.createTablet();
        return tab;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter device type: elite, medium or lite");
        String deviceType = scanner.nextLine();
        scanner.close();
        Hub hub = new Hub(deviceType);
        
        Laptop book = hub.createBook();
        book.powerOn();
        book.displayInfo();
        Smartphone smartphone = hub.createPhone();
        smartphone.powerOn();
        smartphone.displayInfo();
        Tablet tab = hub.createTab();
        tab.powerOn();
        tab.displayInfo();
         
        /**
         * @implNote 
         * Con questa implementazione non è possibile usare `devices` per creare i dispositivi:
         * With this implementation you cannot use `devices` to create devices:
         * 
         * Laptop book = devices.createLaptop(); 
         * Smartphone smartphone = devices.createPhone();
         * Tablet tab = devices.createTab(); 
         * 
         * così l'utente non si interfaccia con l'AbstractFactory ma con Hub che è il client, 
         * si crea un'altra astrazione che può consentire di aggiungere ad esempio il limite di creazioni.
         * so the user does not interface with the AbstractFactory but with Hub which is the client,
         * another abstraction is created that can allow you to add the creation limit for example.
         *
         */
    }
}

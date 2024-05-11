/**
 * Devices Factory is the Abstract Factory
 */

public interface DevicesFactory {

    Laptop createLaptop();
    Smartphone createSmartphone();
    Tablet createTablet();

}

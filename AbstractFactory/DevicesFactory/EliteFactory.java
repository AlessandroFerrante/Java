/**
 * ConcreteFactory
 */
public class EliteFactory implements DevicesFactory{
    @Override
    public Laptop createLaptop() {
        return new EliteBook();
    }
    
    @Override
    public Smartphone createSmartphone() {
        return new ElitePhone();
    }

    @Override
    public Tablet createTablet() {
        return new EliteTab();
    }
}

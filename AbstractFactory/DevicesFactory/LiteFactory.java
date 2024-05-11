/**
 * ConcreteFactory
 */
public class LiteFactory implements DevicesFactory{
    @Override
    public Laptop createLaptop(){
        return new LiteBook();
    }

    @Override
    public Smartphone createSmartphone(){
        return new LitePhone();
    }

    @Override
    public Tablet createTablet(){
        return new LiteTab();
    }

}

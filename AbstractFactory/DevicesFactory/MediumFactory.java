/**
 * ConcreteFactory
 */
public class MediumFactory implements DevicesFactory {    
    @Override
    public Laptop createLaptop(){
        return new MediumBook();
    }
        
    @Override
    public Smartphone createSmartphone(){
        return new MediumPhone();
    }
        
    @Override
    public Tablet createTablet(){
        return new MediumTab();
    }
}

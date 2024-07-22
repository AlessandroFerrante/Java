// Central is a ConcreteMediator
public class Central {
    private Element adder = new Adder(this); 
    private Element kl = new KeyListener(this);
    private Element numPi = new Number(this); 
    private Element names = new Name(this);

    private boolean active = true;

    public void init(){
        String str;
        do {
            str = kl.doWork();
            if(str.equals("q"))
                break;
            alert(str);
        }while(active);
    }

    public void alert(String str) {
        try {
            int v = Integer.parseInt(str);
            adder.put(v);
            numPi.put(v);
        } catch (NumberFormatException nfe) {
            adder.reset();
            numPi.reset();
            names.put(str);
        }
    }

    public void stop() {
        active = false;
        numPi.put("Numbers: ");
        adder.put("Sum: ");
        names.put(0);
    }
}

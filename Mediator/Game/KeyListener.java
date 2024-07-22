import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// ConcreteColleague
public class KeyListener implements Element {
    private final Central c;
    private BufferedReader input;
    private int count = 0;

    public KeyListener(Central m){
        c = m;
        System.out.println("Write a number or letter");
        System.out.println("q to exit");
    }

    public void put (final String msg){ 
        System.out.println("You have inserted " + count + " input");
    }
    public void put (final int v){}

    public String doWork(){
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            String str = input.readLine();
            count++;
            if (count == 10) c.stop();
            return str;
        } catch (final IOException ioe) {
            System.err.println(ioe);
        }
        return null;
    }
    public void reset(){

    }
}

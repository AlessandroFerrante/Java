import java.util.Arrays;
// ConcreteColleague
public class Name implements Element{
    private final Central c;
    private final String[] names = { "Ale", "Marco", "ale"};
    private final String[] nms = new String[3];
    //private final int iniz = 2;
    private int i = 0;

    public Name(Central m){
        c = m;
        System.out.println("Guess the next three names: ");
    }
    
    public void put (final String msg){ 
        if (i < 3){
            nms [i] = msg;
            i++;
        }
        if (i == 3)
            doWork(); 
    }

    public void put (final int v){
        if(i == 3) System.out.println("Correct sequence");
        else System.out.println("Incorrect sequence ");
    }
    
    public String doWork(){
        System.out.println("Sequence: ");
        Arrays.stream(names).forEach(x -> System.out.println(x));
        
        if (Arrays.equals(names, nms)) {
            System.out.println("You guessed the sequence!");
            c.stop();
        } else {
            System.out.println("You haven't guessed right");
        }
        i = 0;
        return null;
    }
    
    public void reset(){}

}
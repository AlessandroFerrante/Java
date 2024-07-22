import java.util.Arrays;
// ConcreteColleague
public class Number implements Element{
    private final Central c;
    private final int [] pi = {1, 5, 9};
    private final int [] num = new int[3];
    private int i = 0;

    public Number (final Central m) { 
        c= m;
        System.out.println("Guess the next 3 digits of pi: 3.14... ");
    }

    public void put (final String msg){ 
        System.out.println(msg + " ");
         if(i == 3) System.out.println("Correct sequence");
         else System.out.println("Incorrect sequence ");
    }
    public void put (final int v){
        if (i < 3){
            num [i] = v;
            i++;
        }
        if (i == 3)
            doWork();    
    }
    public String doWork(){

        System.out.println("Sequence: ");
        Arrays.stream(num).forEach(x -> System.out.println(x));
        
        // boolean match = Arrays.stream(num).allMatch(x -> Arrays.stream(pi).anyMatch(y -> x == y));

        // if (match) {
        if (Arrays.equals(num, pi)) {
            System.out.println("You guessed the sequence!");
            c.stop();
        } else {
            System.out.println("You haven't guessed right");
        }

        i = 0;
        return null;
    }
    public void reset(){
        i = 0;
    }
}

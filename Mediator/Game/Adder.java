// ConcreteColleague
public class Adder implements Element{
    private final Central c ;
    private int sum = 0;
    private int count = 0;
    private int average = 0;

    public Adder(Central m){
        c = m;
    }

    public void put (final String msg){ 
        System.out.println(msg);
        doWork();
        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " + average);
    }
    public void put (final int v){
        count++;
        sum += v;
        if (sum  >= 100)
            c.stop();
    }
    public String doWork(){
        if(count > 0) 
            average = sum /count;
        return null;
    }
    public void reset(){
        sum = 0;
        average = 0;
    }
}

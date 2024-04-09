/**
 * Utility class that is used to color the output based on expected values.
 * Method names conform to the JUnit library 
 * 
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-08
*/

public class MyTestSupport {
    private static final String RESET = "\33[0m";
    private static final String GREEN = "\33[1;32m";
    private static final String RED = "\33[1;31m";

    private static final String OK = GREEN + "OK " + RESET;
    private static final String FAIL = RED + "FAILED " + RESET;   

    /**
     * 
     * @param a risultato calcolato | calculated result
     * @param b risultato atteso | expected result
     * @param string messaggio da stampare | message to print
     */
    protected void assertEquals(float a, float b, String string) {
        if(a == b)
            System.out.print(OK);
        else
            System.out.print(FAIL);
        System.out.println(string);
    }

    protected void assertEquals(int a, int b, String msg) {
        if(a == b) 
            System.out.print(OK);
        else
            System.out.print(FAIL);
        System.out.println(msg);
    }

    protected void assertEquals(String a, String b, String msg) {
        if (a.equals(b))
            System.out.print(OK);
        else
            System.out.print(FAIL);
        System.out.println(msg);
    }

    protected void assertTrue(boolean value, String msg) {
        if (value)
            System.out.print(OK);
        else
            System.out.println(FAIL);
        System.out.println(msg);
    }
}

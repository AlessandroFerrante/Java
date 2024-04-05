/**
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-04
 */

import java.time.LocalDate;

public class HelloWorld {

    private String courseName = "Software Engineering";
    public static LocalDate d;
    public static void main(String[] args){
        System.out.println("Hello World :)"); // x viene visualizzato dall'editor 

        HelloWorld hw = new HelloWorld(); // crea un instanza della classe dentro hw

        hw.printDate("bye bye");

        System.out.println(hw.courseName);

        /* Uso la classe Screen */

        Screen.print("Hello World");

        Screen.print(hw.courseName);
       
       /* Uso del */
        d = LocalDate.now();

    }
   
    private void printDate(String greeting){
        System.out.println(greeting);
        System.out.println("7 March 2024");

        Screen.print(greeting);
        Screen.print("7 March 2024");
    }

}
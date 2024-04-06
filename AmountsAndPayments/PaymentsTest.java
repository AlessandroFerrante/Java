/**
 * This class is a subclass of the MyTestSupport class and implements assert methods.
 * It is used to test the methods implemented in the Payments class through the assertEquals and assertTrue methods.
 * Some test methods use predefined values in a list, while others verify the correct reading of values from the file and the opening of the file itself.
 * 
 * @author Alessandro Ferrante
 * @version 0.1
 * @since 2024-04-06
 * */

public class PaymentsTest extends MyTestSupport {
    private final Payments pay = new Payments();
    private final String fileName = "Amounts.csv";
    private final String path = "./";

    public static void main(String[] args) { 
        PaymentsTest t = new PaymentsTest();
        t.testReadFile();
        t.testReadValueFromFile();
        t.testSumValue();
        t.testMaxValue();
    }

    private void initList() {
        pay.clear();
        pay.insert("321.01");
        pay.insert("531.7");
        pay.insert("1234.5"); 
        pay.converted();
    }

    public void testSumValue() {
        initList();
        pay.calculateSum();
        assertEquals(pay.getSum(), 2087.21f, "Sum");
    }

    public void testReadFile() {
        pay.clear();
        try {
            pay.readFile(path, fileName);
            assertTrue(true, "Open and read file");
        } catch (Exception e) {
            assertTrue(false, "Open and read file");
        }
    }

    public void testReadValueFromFile() {
        pay.clear();
        try {
            pay.readFile(path, fileName);
        } catch (Exception e) {
            assertTrue(false, "Read value from file");
        }
        if (pay.getDimens() > 1) { 
            assertTrue(true, "Value read from file");
            String item = pay.getItems(0);
            assertEquals(Float.parseFloat(item), 1946.28f, "Value from file");
        }
    }

    public void testMaxValue() {
        initList();
        pay.calculateMax();
        assertEquals(pay.getMax(), 1234.5f, "Max value");
    }
}

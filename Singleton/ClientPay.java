public class ClientPay {
    
    public static void main(final String[] args) {
        Payments p = Payments.getInstance();
        p.clear();
        try {
            p.readFile("./", "Amounts.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        p.converted();
        p.calculateSum();
        p.calculateMax();
        System.out.println("Dimension: " + p.getDimens());
        System.out.println("Max: " + p.getMax());
        System.out.println("Total: " + p.getSum());
    }
}

public class TestLogs extends MyTestSupport{
    private Logs lg = Logs.getIstance();

    public static void main(String[] args){
        TestLogs tl = new TestLogs();
        tl.testSingl();
        tl.testAll();
        tl.testLast();
    }
    
    /**
     * @implNote
     * verfica che il singleton Logs funzioni correttamente, creando un nuvo rifermento all'istanza di 'Logs' e aggiugendo più record
     * verify that the Logs singleton is working correctly by creating a new reference to the 'Logs' instance and adding more records
     * @implSpec
     * Anche se vengono aggiunti nuovi riferimenti all'istanza di 'Logs', tutti puntano alla stessa a all'unica istanza.
     * Quind i record aggiunt icon il rifermento lg2 sono aggiunti effettivamente all'stanza orginale 'lg', 
     * cosi i test 'assertEquals' funzionano come previsto.
     * Even if new references to the 'Logs' instance are added, they all point to the same and single instance.
     * So records added with the lg2 reference are actually added to the original 'lg' stanza,
     * so 'assertEquals' tests work as expected.
     * 
     * @param lg2 è un nuovo riferimento all'unica istanza di Logs, la stessa di 'lg'.
     *           is a new reference to the single instance of Logs, the same as 'lg'.
     */
    public void testSingl() {
        initLogs();
        Logs lg2 = Logs.getIstance();
        lg2.record("one");
        lg2.record("two");
        assertEquals(lg.dumpLast(), "two", "test logs singleton");
    }

    public void testLast() {
        initLogs();
        assertEquals(lg.dumpLast(), "three", "test logs last");
    }

    public void testAll() {
        initLogs();
        assertEquals(lg.dumpAll(), "one two three", "test logs all");
    }

    private void initLogs() {
        lg.empty();
        lg.record("one ");
        lg.record("two ");
        lg.record("three");
    }
}

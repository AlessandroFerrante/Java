public class TestLabel {
    static public void main(String args[]) {
        testGetLabel();
        testChangeLabel();
        testNoChangeLabel();
        testUsed();
        testGeneral();
    }

    private static void testGetLabel() {
        ILabel l = new Label("LABEL");
        if (l.getNextLabel().equals("LABEL1")) System.out.println("OK Test get label");
        else System.out.println("FAILED Test get label");
    } 

    private static void testChangeLabel() {
        ILabel l = new Label("LABEL");
        l.insertTag("ETIQUETA");
        if(l.getNextLabel().equals("ETIQUETA1")) System.out.println("OK Test change label");
        else System.out.println("FAILED Test change label");
    }

    private static void testNoChangeLabel() {
        ILabel l =new Label("LABEL");
        l.insertTag("ETIKETT");
        if(l.getNextLabel().equals("LABEL1")) System.out.println("OK Test no-change label");
        else System.out.println("FAILED Test no-change label");
    }

    private static void testUsed() {
        ILabel l = new Label("LABEL");
        if(l.checkUsed(1) && !l.checkUsed(2)) System.out.println("OK Test used 1");
        else System.out.println("FAILED Test used 1");
        l.getNextLabel();
        if(l.checkUsed(2)) System.out.println("OK Test used 2");
        else System.out.println("FAILED Test used 2");
    }   
    
    private static void testGeneral() {
        ILabel l = new Label("LABEL");
        l.insertTag("ETICHETTA");
        if(l.checkUsed(1) && !l.checkUsed(2)) System.out.println("OK Test general-used 1");
        else System.out.println("FAILED Test general-used 1");
        l.getNextLabel();
        if(l.checkUsed(2) && !l.checkUsed(3)) System.out.println("OK Test general-used 2");
        else System.out.println("FAILED Test general-used 2");
        
        if(l.getNextLabel().equals("ETICHETTA1")) System.out.println("OK Test general-change label 1");
        else System.out.println("FAILED Test general-change label 1");
        if(l.getNextLabel().equals("ETICHETTA2")) System.out.println("OK Test general-change label 2");
        else System.out.println("FAILED Test general-change label 2");
        
        if(l.checkUsed(2)) System.out.println("OK Test used 2");
        else System.out.println("FAILED Test used 2");
    }
}

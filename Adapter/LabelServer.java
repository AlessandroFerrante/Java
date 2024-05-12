 /**
 * Classe che ha ruolo di Adaptee, necessita di essere converita / adattata all'interfaccia ILabel. |
 * Class that has the role of Adaptee, needs to be converted / adapted to the ILabel interface
 * 
 * @implSpec
 * LabelServer è un Adptee, classe che necessita l'adattamento.
 * LabelServer is an Adptee, class that requires adaptation. 
 * 
 * @implNote
 * Questa classe implementa un server per la generazione di etichette. |
 * This class implements a label generation server.
 */
public class LabelServer {
    /**
     * @param num contatore di etichette.| label counter.
     * @param prefix prefisso dell'etichetta. | label prefix. 
     */
    private int num = 1;
    private String prefix;
    
    /**
     * Costruttore della classe. |
     * Class constructor
     * @param p prefisso da usare per l'etichetta. | prefix to use for the label.
     */
    public LabelServer(String p) {
        prefix = p;
    }
    
    /**
     * Restituisce l'etichetta formata da un prefisso ed da un numero incrementale. |
     * Returns the label consisting of a prefix and an incremental number.
     * @return prefix + num, l'etichetta composta. | prefix + num, the composite label.
     */
    public String serveNextLabel() {
        return prefix + num++;
    }
    
    /**
     * Restituisce il numero totale di etichette generate. |
     * Returns the total number of labels generated.
     * @return contatore. | counter.
     */
    public int getCount() {
        return num;
    }
    
    /**
     * Cambia il prefisso utilizzato per le etichette. |
     * Change the prefix used for labels.
     * @param s Il nuovo prefisso da utilizzare. | The new prefix to use.
     */
    public void change(String s) {
        prefix = s;
    }
}

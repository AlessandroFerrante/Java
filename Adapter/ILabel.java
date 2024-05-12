/**
 * Classe che implemeta un'interfacia basata su design pattern Adapter. |
 * Class that implements an interface based on the Adapter design pattern.
 * 
 * @implSpec 
 * ILabel è un Target, l'interfaccia che il client si aspetta. | 
 * ILabel is a Target, the interface the client expects
 */

public interface ILabel {
    /**
     * @implNote
     * Definizioni dei metodi implementati nell'Adapetr. |
     * Definitions of the methods implemented in the Adapetr.
     */
    public String getNextLabel();
    public boolean checkUsed(int k);
    public void insertTag(String s);
}

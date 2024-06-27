import java.util.Arrays;
import java.util.List;

/**
 * Classe che ha il ruolo di Adpter, converte, adatta le chiamate del client all'interfaccia, 
 * conosce i metodi dell'Adaptee e li usa nelle sue implemetazioni, tiene una sua istanza e sa come invocarlo.  |
 * Class that has the role of Adpter, converts and adapts client calls to the interface,
 * knows the Adaptee methods and uses them in his implementations, keeps an instance of it and knows how to invoke it.
 * 
 * @implSpec
 * Label è un Adpter, adatta una classe alle chiamate del client, conoscendo i suoi metodi. |
 * Label is an Adapter, it adapts a class to the client calls, knowing its methods.
 */
public class Label implements ILabel{
    private List< String > l = Arrays.asList("ETICHETTA", "LABEL", "ÉTIQUETTE", "ETIQUETA");
    private LabelServer ls;
    private String p; 

    /**
     * @implSpec
     * Istanzia un Adaptee. |
     * Instantiate an Adapter
     */
    public Label(String prefix)  {
        p = prefix;
        // ls = new LabelServer(p); // removed for the lazy initialization
    }
    
    // Lazy initialization
    private void LazyInitialization(){
        if(ls == null)
            ls = new LabelServer(p);
    }

    /**
     * L'adattamento consiste nel chiamare un metodo con nome diverso sull'Adaptee. |
     * Adaptation consists of calling a differently named method on the Adaptee
     * 
     * @implSpec
     * Addatta il metodo `serverNextLabel()` cambiando il nome del metodo. |
     * Adapt the `serverNextLabel()` method by changing the method name
     */
    @Override
    public String getNextLabel() {
        LazyInitialization();
        return ls.serveNextLabel();
    }

    /**
     * L'adattamento consiste nel fornire una funzionalita' diversa rispetto a quella del metodo sull'Adaptee, che implementa solo parzialmente quanto richiesto dal client. |
     * Adaptation consists in providing a different functionality compared to that of the method on the Adaptee, which only partially implements what is requested by the client
     * 
     * @implSpec
     * Adatta il meotodo `getCount()` restituendo true se la condizione è soddisfatta, altrimenti false. |
     * Adapts the `getCount()` method by returning true if the condition is satisfied, false otherwise.
     */
    @Override
    public boolean checkUsed(int k) {
        LazyInitialization();
        return (ls.getCount() >= k);
    }

    /**
     * ! Attenzione ! questo metodo non è destinato a inserire il prefisso in una nuova etichetta ma a cambiarlo in una già esitente, per cui la restrizione sui prefissi da scegliere è impartita solo sulla modifica. 
     * ! Please note ! this method is not intended to insert the prefix in a new label but to change it in an existing one, so the restriction on the prefixes to choose is given only on the modification.
     * 
     * L'adattamento consiste nel soddisfare una condizione per usare il metodo dell'Adaptee. |
     * Adaptation consists of satisfying a condition to use the Adaptee method.
     * 
     * @implSpec
     * Se il valore s non è contenutto tra quelli permessi nella lista l, non verrà usato il metodo dell'Adaptee. |
     * If the value s is not included among those allowed in list l, the Adaptee method will not be used.
     * @implNote
     * Il metodo dell'Adaptee consente di cambiare il prefisso, con questo adattamento verrà fatto solo se il prefisso è contenuto nella lista l. |
     * The Adaptee method allows you to change the prefix, with this adaptation will only be done if the prefix is ​​contained in list l.
     */
    @Override
    public void insertTag(String s) {
        LazyInitialization();
        if (l.contains(s)) ls.change(s);
    }
    
}

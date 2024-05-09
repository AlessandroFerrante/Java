# Design Pattern Factory Method

**Modello di Proggettazione creazionale.**

>Suggerisce di sostituire le chiamate dirette alla costruzione di oggetti, e quindi a una sola specifica classe, con una classe con uno speciale `metodo factory`, che potrà essere sovrascrtitto dalle *sottoclassi*, restituendo ***prodotti diversi***.

>❗ Le sottoclassi per poter restituire prodotti di diverso tipo necessitano di una classe base o un'`interfaccia` comune, che appunto si inferaccia con i diversi tipi di prodotti.

### Struttura
 - **Creator**: dichiara il metodo *factory vuoto*;
 - **Concrete Creators**: *sottoclassi* di `Creator`, sovrascrivono il *metodo factory* e restituisce il `prodotto`;
 - **Product**: `interfaccia` comune a tutti gli oggetti prodotti dalle sottoclassi;
 - **Concrete Product**: sono *sottoclassi* di `Pruduct` che implementano i metodi dei diversi tipi di prodotti;

![Struttura](image.png)

*[Alessandro Ferrante](http://alessandroferrante.net)* 
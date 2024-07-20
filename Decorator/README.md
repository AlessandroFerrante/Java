# Design Pattern Decorator

Modello di progettazione 
> Permettere di aggiungere e sottrarre responsabilità a runtime

> Evita di complicare il Client con metodi  differenti per operazioni diverse.
## Struttura
- **Component**: ' definisce l'interfaccia per gli oggetti che possono avere aggiunte le responsabilità dinamicamente;
- **ConcreteComponent**: definisce un ogetto su cui poter aggiungere responsabilità;
- **Decorator**: mantiene un riferimento a un oggetto Component, inoltra le sue richieste al suo oggetto Component, puo fare anche altre operazioni prima e dopol'inoltro;
- **ComponentDecorator**: implementa la responsabilità aggiunta al component;
![alt text](image.png)

- `super`: richiama il costruttore della superclasse e se deve essere usato bisogna implementarlo per primo.

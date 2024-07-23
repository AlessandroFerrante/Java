# Restaurant Bridge

- **Abstraction** : `Restaurant`;
- **Refined Abstraction** : `CasualRestaurnat` `StarryRestaurnat`
- **Implementor** : `Pasta`;
- **Concrete Implementor** : `Spaghetti` e `Trofie`
    > *Note! : In this example the classes that implement the Pasta interface provide concrete operations for specific types of pasta, they could also concern, for example, taste*.
  
```mermaid
classDiagram
    direction LR
    class Restaurant {
        <<abstract>>
        -Pasta pasta
        #request(Pasta pasta)
        +addSauce() 
        +addToppings()
        +addCookingType()
        +serveDish()
    }
    class CasualRestaurant {
        #request(Pasta pasta)
        +addSauce()
        +addToppings()
        +addCookingType()
    }
    class StarryRestaurant {
        #request(Pasta pasta)
        +addSauce()
        +addToppings()
        +addCookingType()
    }
    class Pasta {
        <<interface>>
        +prepare()
    }
    class Spaghetti {
        +prepare()
    }
    class Trofie {
        +prepare()
    }

    Restaurant <|-- CasualRestaurant
    Restaurant <|-- StarryRestaurant
    Restaurant --> Pasta
    Pasta <|.. Spaghetti
    Pasta <|.. Trofie
    Client --> Restaurant
```
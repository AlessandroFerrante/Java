# DevicesFactory

- **AbstractFActory**: `DeviceHub`;
- **ConcreteFactories**: `EliteFactory`, `MediumFactory`, `LiteFactory`;
- **AbstractProducts**:  `Laptop`, `Smartphone`, `Tablet`;
- **Products**: `EliteBook`, `ElitePhone`, `EliteTab`, `MediumBook`, `MediumPhone`, `MediumTab`, `LiteBook`, `LitePhone`, `LiteTab`;
- **Client**: `DevicesHub`; 

### Struttura

```mermaid
---
title: DevicesFactory
---
classDiagram
    Hub --> DeviceHub
    Hub --> Laptop
    Hub --> Smartphone
    Hub --> Tablet

    DeviceHub <|.. EliteFactory
    DeviceHub <|.. MediumFactory
    DeviceHub <|.. LiteFactory

    Laptop <|.. EliteBook
    Laptop <|.. MediumBook
    Laptop <|.. LiteBook
    Smartphone <|.. ElitePhone
    Smartphone <|.. MediumPhone
    Smartphone <|.. LitePhone
    Tablet <|.. EliteTab
    Tablet <|.. MediumTab
    Tablet <|.. LiteTab 

    EliteFactory --> EliteBook 
    EliteFactory --> ElitePhone
    EliteFactory --> EliteTab 
    MediumFactory --> MediumBook 
    MediumFactory --> MediumPhone 
    MediumFactory --> MediumTab 
    LiteFactory --> LiteBook 
    LiteFactory --> LitePhone 
    LiteFactory --> LiteTab    

    <<interface>> DeviceHub
    <<interface>> Laptop
    <<interface>> Smartphone
    <<interface>> Tablet
    class Hub{
        
    }
    class DeviceHub {
        + createLaptop() Laptop
        + createSmartphone() Smartphone
        + createTab() Tablet
    }
    class EliteFactory {
        + createLaptop() Laptop
        + createSmartphone() Smartphone
        + createTab() Tablet
    }
    class MediumFactory {
        + createLaptop() Laptop
        + createSmartphone() Smartphone
        + createTab() Tablet
    }
    class LiteFactory {
        + createLaptop() Laptop
        + createSmartphone() Smartphone
        + createTab() Tablet
    }

    class Laptop {
        + powerOn() void
        + displayInfo() void
    }
    class Smartphone {
        + powerOn() void
        + displayInfo() void
    }
    class Tablet {
        + powerOn() void
        + displayInfo() void
    }

    class EliteBook {
        + powerOn() void
        + displayInfo() void
    }
    class MediumBook {
        + powerOn() void
        + displayInfo() void
    }
    class LiteBook {
        + powerOn() void
        + displayInfo() void
    }
    class ElitePhone {
        + powerOn() void
        + displayInfo() void
    }
    class MediumPhone {
        + powerOn() void
        + displayInfo() void
    }
    class LitePhone {
        + powerOn() void
        + displayInfo() void
    }
    class EliteTab {
        + powerOn() void
        + displayInfo() void
    }
    class MediumTab {
        + powerOn() void
        + displayInfo() void
    }
    class LiteTab {
        + powerOn() void
        + displayInfo() void
    }

```

*[Alessandro Ferrante](http://alessandroferrante.net)*

*Credits uml diagram* [mermaid](https://mermaid-js.github.io/mermaid/) 
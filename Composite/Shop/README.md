# Shop Composite

- **Component** : *interface* `Products` **methods**  `show()` `getPrice()`, `getWeight()` e `add()`, `remove()`;
- **Leaf** : `Prod1` e `Prod2` *extend* the *interface* `Products` only implements `show()` `getPrice()` e `getWeight()`;
- **Composite** : `Cart` *extend* the *interface* `Products` and implements all its methods;
- **Shop**: `Creator` with methods `getCart()`, `getProd1()` e `getProd2()`;
- **Client**: `Client`; 
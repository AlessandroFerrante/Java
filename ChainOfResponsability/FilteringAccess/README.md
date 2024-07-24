**EN**
# Filtering Access

 - **Manager**: *interface* `Middleware`;
 - **BaseHandler**: *abstract class* `BaseMiddleware` *implements* `Middleware`;
 - **ConcreteHandler**: `ThrottlingMiddleware`, `UserExistsMiddleware` and `RoleCheckMiddleware` *extends* `BaseMiddleware` ;
 - **Server**: save *email* and *password* in a `HashMap`;
 - **Client**: make requests to `ConcreteHandler`;

#### Methods

1. **Connection method (link)**:

 Used to easily build handler chain.
 Instead of manually passing each subsequent handler to each handler's constructor, you use the link method to easily construct the entire chain in one go. Replaces building the chain manually using the `ConcreteHandler` constructor and the `setNext()` method.

2. **Management (control) method**:

 It handles the request, it is implemented in every concrete handler. If the handler can handle the request, it executes the relevant logic; otherwise, it passes the request to the next handler in the chain.
 
3. **Next handler method (checkNext)**:

 Passes the request to the next handler in the chain. Check if there is a next handler and if so, pass the request to it. If there is no subsequent handler, end the process. Boilerplate code for this separated and implemented in the *BaseHandler* `BaseMiddleware`

---

**IT**
# Filtering Access

  - **Handler**: *interface* `Middleware`;
  - **BaseHandler**: *abstract class* `BaseMiddleware` *implements* `Middleware`;
  - **ConcreteHandler**: `ThrottlingMiddleware`, `UserExistsMiddleware` e `RoleCheckMiddleware` *extends* `BaseMiddleware` ;
  - **Server**: salva *email* e *password* in un `HashMap`;
  - **Client**: effettua richieste ai `ConcreteHandler`;

#### Methods

1. **Linking Method (link)** :
   
   Utilizzato per costruire facilmente la catena di handler.
   Invece di passare manualmente ogni handler successivo al costruttore di ogni handler, si utilizza il metodo link per costruire facilmente l'intera catena in un colpo solo. Sostituisce la costruzione della catena manualmente utilizzando costruttore del `ConcreteHandler` e il medoto `setNext()`.
2. **Handling Method (check)** :

    Gestisce la richiesta, è implementato in ogni handler concreto. Se l'handler può gestire la richiesta, esegue la logica pertinente; altrimenti, passa la richiesta al prossimo handler nella catena.
3. **Next Handler Method (checkNext)**:

    Passa la richiesta al prossimo handler nella catena. Verifica se esiste un handler successivo e, in tal caso, gli passa la richiesta. Se non c'è un handler successivo, conclude il processo. Codice boilerplate per questo separato e implementato nel *BaseHandler* `BaseMiddleware` 
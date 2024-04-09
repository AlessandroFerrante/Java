# Singleton and Multiton
Two implementation examples of the *Design Pattern* **Singleton**. The `Logs` class is a **Singleton**, the `Fib` class is also a **Singleton** its client is the `MainFib` class.

The `MyTestSupport` utility class is used for tests, the `TestLogs` subclass is the test for the `Logs` class.

Note the `static` method `getInstance()`, the `static` field, and the `private` constructor needed to avoid creating additional instances from the outside.

The `Pagamenti` class implements a **Multiton**, its client is the `ClientPagam` class.
### Ejercicio Práctico: Sistema de Gestión de Biblioteca

**Objetivo**:
Desarrollar un sistema para gestionar una biblioteca, que incluya el manejo de libros, usuarios y préstamos. Este ejercicio te permitirá practicar conceptos como la herencia, la composición y el manejo de colecciones en Java.

**Descripción**:
**1. Clase Base `Item`**:
   - Atributos: `title` (String), `author` (String), `yearPublished` (int).
   - Método: Constructor y `showDetails()` para imprimir detalles del ítem.

**2. Clase `Book` Heredando de `Item`**:
   - Atributos adicionales: `isbn` (String), `availableCopies` (int).
   - Constructor para inicializar todos los atributos.
   - Sobreescribe `showDetails()` para incluir ISBN y copias disponibles.

**3. Clase `User`**:
   - Atributos: `username` (String), `registeredDate` (LocalDate).
   - Métodos: Constructor, getters y método `showInfo()` para mostrar información del usuario.

**4. Clase `Loan`** (Composición):
   - Atributos: `user` (User), `book` (Book), `loanDate` (LocalDate), `returnDate` (LocalDate).
   - Constructor para inicializar todos los atributos.
   - Método `showLoanDetails()` para mostrar información del préstamo.

**5. Clase `Library`**:
   - Atributos: `books` (Lista de `Book`), `users` (Lista de `User`), `loans` (Lista de `Loan`).
   - Métodos: `addBook(Book book)`, `addUser(User user)`, `registerLoan(Loan loan)`, `showLibraryStatus()`.

### Tareas:
- Implementa todas las clases mencionadas con sus atributos y métodos correspondientes.
- En la clase principal (`main`), crea una instancia de `Library` y añade varios libros, usuarios y préstamos.
- Utiliza el método `showLibraryStatus()` para ver el estado actual de la biblioteca (libros disponibles, usuarios registrados y préstamos activos).

### Puntos Adicionales para Practicar:
- **Excepciones**: Maneja excepciones personalizadas para situaciones como libros no disponibles o préstamos ya existentes.
- **Colecciones**: Utiliza colecciones como `HashMap` para manejar eficientemente los libros y los usuarios por su identificador único (como ISBN o nombre de usuario).
- **Fecha y Hora**: Usa la clase `LocalDate` de Java para manejar las fechas de registro de usuarios y de préstamos de libros.
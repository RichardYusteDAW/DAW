### Ejercicio Práctico: Sistema de Biblioteca Multimedia

**Objetivo**:
Desarrollar un sistema de gestión para una biblioteca multimedia que incluya libros, películas y discos de música, utilizando los conceptos de herencia y composición.

**Descripción**:
**1. Crear Clase Base `Item`**:
   - Atributos: `title` (String), `author` (String), `publicationYear` (int).
   - Métodos:
     - Constructor que inicialice los atributos.
     - `showDetails()`: Método para imprimir detalles del ítem.

**2. Crear Clase `Book` Heredando de `Item`**:
   - Atributos adicionales: `pagesNum` (int), `genre` (String).
   - Constructor que inicialice todos los atributos (incluyendo los de la clase base).
   - Sobreescribe `showDetails()` para incluir los nuevos atributos.

**3. Crear Clase `Film` Heredando de `Item`**:
   - Atributos adicionales: `duration` (en minutos, tipo int), `director` (String).
   - Constructor que inicialice todos los atributos.
   - Sobreescribe `showDetails()` para mostrar la duración y el director.

**4. Crear Clase `DiscMusic` Heredando de `Item`**:
   - Atributos adicionales: `genero` (String), `songNum` (int).
   - Constructor que inicialice todos los atributos.
   - Sobreescribe `showDetails()` para incluir el género y número de canciones.

**5. Crear Clase `Library` con Composición**:
   - Atributos: `items` (Lista de objetos de tipo `Item`).
   - Métodos:
     - `addItem(Item item)`: Añade un nuevo ítem a la biblioteca.
     - `showItems()`: Muestra los detalles de todos los ítems.

**Tareas**:
- Implementar todas las clases mencionadas con sus atributos y métodos correspondientes.
- En la clase principal (`main`), crea una instancia de `Library` y añade varios libros, películas y discos de música.
- Llama al método `showItems()` para ver los detalles de todos los ítems añadidos.
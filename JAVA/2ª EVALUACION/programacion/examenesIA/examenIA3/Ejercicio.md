### Ejercicio Práctico: Sistema de Reserva de Viajes

**Objetivo**:
Desarrollar un sistema para gestionar reservas de viajes, que incluya el manejo de clientes, reservas de vuelos y hoteles. Este ejercicio te permitirá practicar la herencia y la composición en Java.

**Descripción**:
**1. Clase Base `Person`**:
   - Atributos: `name` (String), `surname` (String), `id` (String).
   - Método: Constructor y `showInfo()` para imprimir detalles de la persona.

**2. Clase `Client` Heredando de `Person`**:
   - Atributos adicionales: `email` (String), `phone` (String).
   - Constructor para inicializar todos los atributos.
   - Sobreescribe `showInfo()` para incluir el email y el teléfono.

**3. Clase `Flight` y `Hotel`**:
   - Atributos específicos para cada uno (como `destination`, `date`, `price`, `hotelName`, `rooms`, etc.).
   - Métodos para mostrar detalles.

**4. Clase `Booking`** (Composición):
   - Atributos: `client` (Cliente), `flight` (Vuelo), `hotel` (Hotel).
   - Constructor para inicializar todos los atributos.
   - Método `showBookingDetails()` para mostrar información de la reserva.

**5. Clase `TravelAgency`**:
   - Atributo: `bookings` (Lista de objetos `Booking`).
   - Métodos: `addBooking(Booking booking)`, `showBookings()`.

### Tareas:
- Implementar todas las clases mencionadas con sus atributos y métodos correspondientes.
- En la clase principal (`main`), crea una instancia de `travelAgency` y añade varias reservas con diferentes clientes, vuelos y hoteles.
- Llama al método `showBookings()` para ver los detalles de todas las reservas.

### Puntos Adicionales para Practicar:
- **Excepciones**: Añade manejo de excepciones personalizadas en la lógica de reserva, por ejemplo, para verificar la disponibilidad de vuelos y hoteles.
- **Colecciones**: Utiliza colecciones avanzadas (como `HashMap` o `HashSet`) para gestionar clientes únicos o vuelos/hoteles disponibles.
- **Fecha y Hora**: Implementa el uso de clases de fecha y hora de Java para manejar las fechas de los vuelos y las reservas de hoteles.
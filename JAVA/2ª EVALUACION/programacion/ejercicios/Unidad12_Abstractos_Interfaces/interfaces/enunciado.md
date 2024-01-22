## Ejercicio 1
- Crea una estructura de paquetes similar a la del tema anterior en el back:
```
/PROYECT
└─ /CONTROLLER ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Capa de PRESENTACIÓN de nuestra aplicación (controladores).
|     └─ BookController.java ─ ─ ─ ─ ─ ─ ─ ─ ─  //Controlador de libros.
|
└─ /DOMAIN   ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Capa de DOMINIO o NEGOCIO de nuestra aplicación (entidades y servicios).
|     └─ /entity ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Entidades de nuestra aplicación.
|     |     └─ Book.java ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Modelo de negocio.
|     └─ /service  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Servicios de nuestra aplicación.
|            └─ <<BooksService>> ─ ─ ─ ─ ─ ─ ─  //Interfaz del caso de uso "Listar todos los libros".
|            └─ /impl  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Implementaciones de nuestros servicios.
|                  └─ BooksServiceImpl.java  ─  //Implementación de la interface BooksService.
|                  
└─ /PERSISTENCE  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Capa de PERSISTENCIA de nuestra aplicación (repositorios).
|      └─ <<BookRepository>>   ─ ─ ─ ─ ─ ─ ─ ─  //Interfaz de acceso a datos de los libros.
|      └─ /impl  ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─  //Implementaciones de nuestros repositorios.
|            └─ StaticBookRepositoryImpl.java   //Implementación estática de la interface BookRepository.
|
└─ App.java ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─   //Clase principal de nuestra aplicación.
```

## Ejercicio 2
- Crea la clase **Book** (será nuestro modelo de negocio) con los atributos __id__, __title__ y __author__.
- La clase tendrá el constructor donde le pasaremos las propiedades del objeto, los `getters` correspondientes y el método `toString()` para mostrar el libro por pantalla.

## Ejercicio 3
- Crea un método en **«BookRepository»** (ten en cuenta que es una interface, con lo que no tendrás que implementarlo) llamado `all()` que devuelva una lista de libros (clase Book). 
- Haz que la clase **StaticBookRepositoryImpl** implemente la interface **«BookRepository»** y devuelva un listado de libros que estarán escritos en el código. La clase podría quedar más o menos así:

```
public class StaticBookRepositoryImpl implements BookRepository{
 
    List<Book> books = List.of(
        new Book(1, "El nombre de la rosa", "Umberto Eco"),
        new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
        new Book(3, "1Q84", "Haruki Murakami")
    );
 
    public List<Book> all() {
        return this.books;
    }
     
}
```
## Ejercicio 4
- Crea la interface **«BookService»** con un sólo método llamado `getAll()`, que devolverá un listado de libros y su implementación en la clase **BooksServiceImpl**, que creará un objeto de tipo **BookRepository** (fíjate que el tipo del objeto es la interface «BookRepository») y devolverá lo retornado por el método `all()`. 
- La clase BooksServiceImpl tendrá una propiedad privada que instanciará un objeto de tipo BookRepository con la implementación correspondiente (StaticBookRepositoryImpl).

```
public class BooksServiceImpl implements BookService{
 
    private BookRepository repository = new StaticBookRepositoryImpl();
 
    public List<Book> getAll() {
        return this.repository.all();
    }
     
}
```

## Ejercicio 5
- Crea en la clase BookController el método `getAll()`. Este método tendrá una propiedad de tipo BookService y devolverá lo retornado por su método getAll():
```
public class BookController {
     
    private BookService service = new BooksServiceImpl();
 
     public List<Book> getAll() {
        return this.service.getAll();
    }
}
```

## Ejercicio 6
- Por último, crea en la clase principal (App) el método `main()`, donde se creará el controlador BookController y se mostrará por pantalla el listado de libros:

```
public class App {
     
    private static BookController controller = new BookController();
     
    public static void main(String[] args) {
         
        List<Book> books = App.controller.getAll();
 
        System.out.println(books);
    }
}
```

## Ejercicio 7
- Crea un enum con 3 libros. Tendrá las propiedades __id__, __title__ y __author__, con su **constructor** correspondiente.
- Crea además una clase **EnumBookRepositoryImpl** que implementará la interface **BookRepository** y recogerá los datos del enum recién creado.
- Cambia en el servicio el Repository que utilizamos para leer los datos de los libros y comprueba que funciona todo correctamente.
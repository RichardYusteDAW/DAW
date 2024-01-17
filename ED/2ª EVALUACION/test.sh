/*Comandos Maven:*/
mvn compile			//Compila el código fuente del proyecto desde el directorio raíz.
mvn clean			//Limpia el proyecto eliminando el directorio 'target'.
mvn test			//Ejecuta las pruebas unitarias utilizando frameworks como JUnit.
mvn package			//Compila el código fuente, ejecuta pruebas y empaqueta el resultado en un archivo JAR o WAR.
mvn install			//Realiza el proceso de 'package' e instala el paquete en el repositorio local de Maven.
mvn clean install	//Limpia el proyecto y luego ejecuta 'install'.
mvn clean package	//Limpia el proyecto y luego ejecuta 'package'.
mvn validate		//Verifica si el proyecto es correcto y toda la información necesaria está disponible.
mvn deploy			//Copia el paquete final al repositorio remoto.

/*Instalar liberías de testing:*/
	//IntelliJ: 
		Alt+Insert >> Add dependency >> org.junit.jupiter:junit-jupiter
		Ctrl+Maj+O || Load Maven Changes //Aplicar cambiois
	
	//VSC: Maven >> Dependencies >> JUnit5
	
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
    </dependency>
</dependencies>

/*Metodos de testing*/
@Test
@DisplayName("Este es mi test")
void calculadoraTest(){
    assertEquals(5, DebugCalculadora.sumar(3, 2));
}

/*Assertions:*/
AssertionError	//Si el test falla.

//assertEquals
assertEquals(10, 3 + 7), 				// Integer.
assertEquals('b', 'a' + 1), 			// Char.
assertEquals(1.5, 3.0 / 2), 			// Double.
assertEquals(1.5, 3.1 / 2, 0.1)			// Float or Double with tolerance (delta).
assertEquals(3.14159, Math.PI, 1e-5);	//1e-5 == 0.00001
assertEquals("A", "a".toUpperCase())	// String.

//assertTrue
assertTrue(5 > 4); 						// Comprueba que 5 es mayor que 4.
assertFalse(5 < 4); 					// Comprueba que 5 no es menor que 4.

//assertNull
String a = null;
String b = "Joan";
assertNull(a);							//Verifica que el objeto es null.
assertNotNull(b);						//Verifica que el objeto NO es null.

//assertSame
String a = "test";
String b = "test";
String c = new String("test");
String d = new String("test");
assertSame(a, a); 						//Verifica que a y a apuntan al mismo objeto. TRUE
assertNotSame(a, b); 					//Verifica que a y b NO apuntan al mismo objeto. FALSE (a y b sí apuntan al mismo objeto ya que Java detectan que poseen el mismo valor y no crea objetos diferentes)
assertSame(c, c); 						//Verifica que c y c apuntan al mismo objeto. TRUE
assertNotSame(c, d); 					//Verifica que a y c NO apuntan al mismo objeto. TRUE (c y d apuntan a objetos diferentes al crearse con new String()).

//assertArrayEquals
assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}); // Verifica que ambos arreglos son iguales,tanto en longitud como en cada uno de sus elementos.

//assertAll
assertAll(
    () -> assertFalse(1 > 0), 			//Esta prueba fallará y ...
    () -> assertTrue(1 > 0)   			//la seguiente intrucción también se comprobará.
)


//1º INSTALAR JAVA: https://www.oracle.com/java/technologies/downloads

//2º CONFIGURAR VARIABLES DE ENTORNO:
	BUSCAR >> VARIABLES DE ENTORNO >> RUTA DEL BIN EN ARCHIVOS DE PROGRAMA
	JAVA_HOME = C:\Program Files\Java\jdk-17
	JRE_HOME  = C:\Program Files\Java\jre-1.8
	
	AÑADIR AL PATH DE WINDOWS:
	%JAVA_HOME%\bin
	
//3º El nombre de la clase debe empezar por mayúscula y tener el mismo nombre que el archivo.

//4º COMPILAR Y EJECUTAR:
	COMPILA: javac file.java  --> crea un archivo: file.class
	EJECUTA: java file
	EJECUTA COMPILANDO AL VUELO: java file.java --> NO crea un archivo: file.class
	
//5º DECLARACIÓN DE VARIABLES:
boolean a;
byte b;
char c;
double d;
float e;
int f;
long g;
short h;

int a, b, c; //Declaramos varias variables con el mismo tipo;
int a = 1;	//Se puede declarar y asignar valor en una sola sentencia;
var a = 1; //Java 10 reconoce el tipo;

//6º CASTEAR VARIABLES:
String a = "1";
(int) a;

//7º PALABRAS RESERVADAS:
abstract	continue	for			new			switch
assert		default		goto		package		synchronized
boolean		do			if			private		this
break		double		implements	protected	throw
byte		else		import		public		throws
case		enum		instanceof	return		transient
catch		extends		int			short		try
char		final		interface	static		void
class		finally		long		strctfp		volatile
const		float		native		super		while

//8º CONSTANTES:
final float A; //final al inicio de la sentencia y la constante en mayúculas;

//9º MOSTRAR POR SALIDA PREDETERMINADA:
System.out.print("Escribe sin salto de línea");
System.out.println("Escribe con salto de línea");

//10º RECOGER DATOS DE ENTRADA:
import java.util.Scanner;
class EntradaSalida {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
        String nombre = reader.nextLine();

        System.out.println("Hola, " + nombre + "!");
    }
}

nextLine()		//Obtiene una nueva línea de entrada.
nextInt()		//Se salta los espacios dejados en blanco hasta que encuentra un valor de tipo int y devuelve ese valor.
nextLong()		//Igual con valores de tipo long.
nextFloat()		//Igual con valores de tipo float.
nextDouble()	//Igual con valores de tipo double.

//11º OPERADORES ARITMETICOS:
+	//suma
-	//resta
*	//multiplicación
/	//división
%	//resto o modulo

+=	//Suma el operando izquierdo con el operando derecho y asigna el resultado a la variable de la izquierda.
–=	//Resta el operando izquierdo con el operando derecho y asigna el resultado a la variable de la izquierda.
*=	//Multiplica el operando izquierdo con el operando derecho y asigna el resultado a la variable de la izquierda.
/=	//Divide el operando izquierdo con el operando derecho y asigna el resultado a la variable de la izquierda.
%=	//Calcula el módulo del operando izquierdo con el operando derecho y asigna el resultado a la variable de la izquierda.

//12º OPERADORES UNARIOS:
-	//Multiplicar el valor por -1.
+	//Multiplica el valor por +1.
++	//Incrementa el valor en una unidad. Si se utiliza delante de la variable, primero aumenta el valor y luego se calcula el resultado. De lo contrario, primero se calcula el resultado y luego se incrementa la variable.
–	//Decrementa el valor en una unidad. Si se utiliza delante de la variable, primero decrementa el valor y luego se calcula el resultado. De lo contrario, primero se calcula el resultado y luego se decrementa la variable.
!	//Niega el valor (usado sobre operadores lógicos).

//13º OPERADORES RELACIONALES:
==	Devuelve true si los operandos son iguales.
!=	Devuelve true si los operandos son diferentes.
<	Devuelve true si el primer operando es menor que el segundo.
>	Devuelve true si el primer operando es mayor que el segundo.
<=	Devuelve true si el primer operando es menor o igual que el segundo.
>=	Devuelve true si el primer operando es mayor o igual que el segundo.

//14º OPERADORES LOGICOS:
&&	AND lógico.
||	OR lógico.

//15º METODOS DE LA CLASE STRING:
.length()						//Devuelve la cantidad de caracteres cadena.
.charAt(int i)					//Devuelve el carácter en la posición i (la primera posición es la 0).
.substring(int i, int j)		//Devuelve la subcadena desde el carácter en la posición i hasta la posición j. (Si no se pasa el parámetro j, se devuelve la subcadena hasta el final de la cadena)
.indexOf(String s, int i)		//Devuelve el índice de la primera aparición de la subcadena s empezando por el índice i especificado. (Si no se pasa el parámetro i, empieza por el principio de la cadena)
.toUpperCase()/toLowerCase()	//Devuelve la cadena con todas las letras en mayúsculas/minúsculas.
.equals()						//Compara dos cadenas y devuelve true si son iguales o false en caso contrario.

//16º CONDICIONALES:
if(condition1){
	
} else if (condition2) {
    
} else {
    
}

switch (key) {
    case value1:
                 
        break;
	case value2:
                 
        break;
         
    default:
        break;
}

switch (key) {
	case value1 -> System.out.println("El número es 1");
	case value2 -> System.out.println("El número es 2");
	case value3 -> System.out.println("El número es 3");
	default -> System.out.println("El número no está entre 1 y 10");
}

//17º BUCLES:
while (condition) {
	System.out.println("Hello");
}

do {
	System.out.println("Hello");
} while (condition);

for (int i = 1; i<10; i++) {
	System.out.println(i);
	
	if(i==4){
		continue;
	}
}

//18º FUNCIONES:
	//Procedimientos (No devuelven ningún valor):
	static void myFunction()		

	//Funciones normales (devuelven un valor):
	static int add(int number1, int number2) {
		return number1 + number2;
	}
	
	//Llamadas de funciones:
	add(1,2);
	
	//Variables globales (al principio del código): 
	static int resultado = 10;

	//Parámetros de longitud variable:
	static void showNum(int... numeros) {
	  for (int numero : numeros) {
		System.out.println(numero);
	  }
	}
	showNum(1, 2, 3, 4, 5);
	
	//Sobrecarga de métodos (funciones con el mismo nombre pero diferentes parámetros):
	static void myFunction(int a) {
        System.out.println("Parámetro de tipo entero");
    }
 
    static void myFunction(float a) {
        System.out.println("Parámetro de tipo float");
    }
	
	static void myFunction(int a, int b) {
        System.out.println("Dos parámetros de tipo entero");
    }
	
	//Recursividad (funciones que se llaman a si mismas):
	static int factorialRecursivo(int number) {
    if (number == 1) {
        return 1;
    } else {
        return (number * factorialRecursivo(number-1));
    }
}

//19º ARRAYS:
	//Declaración:
	int[] numbers;
	numbers = new int[10];
	
	int[] numbers = new int[10];
	
	int[] numbers = {1, 3, 312, 15, 69, 7, 8, 9, 0, 1};
	
	//Multidimensionales:
	int[][] m = new int[5][5];

//20º COLECCIONES:
	.size()				//Número de elementos de la colección.
	.isEmpty()			//TRUE si la colección está vacía.
	.contains(element)	//TRUE si la colección contiene el elemento.
	.add(element)		//Añade elementos a la colección.
	.remove(element)	//Elimina elementos de la colección.
	.toArray()			//Convierte la colección a un array de objetos tipo Object.
	.clear()			//Vacía la colección.
	
	//Conjuntos (No admite duplicados):
	HashSet<Integer> conjunto = new HashSet<Integer>();
	Set<Integer> conjunto = new HashSet<>();
	
	Set<Integer> conjunto = Set.of(2, 10, 3, 23, 99);
	
	//Listas (Admite duplicados):
	List<Integer> lista = new ArrayList<>();
	List<Integer> lista = List.of(1, 3, 5, 67);
	
	List<Integer> subList(index, index)	//Genera una sublista (una vista parcial de la lista) con los elementos comprendidos entre la posición inicial (from, incluida) y la posición final (to, no incluida).
	
	.get(index)				//Obtiene un elemento partiendo de su posición (index).
	.set(index,element)		//Cambia el elemento almacenado en una posición de la lista (index), por otro (element).
	.add(index,element)		//Inserta un elemento (element) en la lista en una posición concreta (index), desplazando los existentes. Si le pasamos solo el elemento (element) la inserción la hará al final de la lista.
	.remove(index)			//Elimina un elemento indicando su posición (index) en la lista.
	.addAll(index,lista)	//Inserta una colección pasada por parámetro en una posición de la lista, desplazando el resto de elementos.
	.indexOf(index)			//Devuelve la posición (índice) de un elemento en la lista o -1 si el elemento no está en la lista.
	.lastIndexOf(index)		//Devuelve la última ocurrencia del objeto en la lista (dado que la lista si puede almacenar duplicados) o -1 si el elemento no está en la lista.
	
	
	//Mapas (clave/valor):
	Map<String, Integer> diccionario = new HashMap<>();
	Map<String, Integer> diccionario = Map.of("edad", 18, "año", 2022);
	
	Set<String> keys = diccionario.keySet(); //Devuelve un conjunto con las claves contenidas en el map.
	
	.put(key,value)			//Asocia el valor (value) con la clave (key) en el map. Si la clave no existe en el map crea un nuevo par clave-valor. Si ya existe, reemplazará el valor.
	.get(key)				//Obtiene el valor asociado a una clave (key) ya almacenada en el mapa. Si no existe la clave, retornará null.
	.remove(key)			//Elimina la clave (key) y el valor (value) asociado. Retorna el valor asociado a la clave, por si lo queremos utilizar para algo, o null, si la clave no existe.
	.containsKey(key)		//Devuelve true si el map tiene almacenada la clave (key).
	.containsValue(value)	//Devuelve true si el map tiene almacenada el valor (value).
	.size()					//Devuelve el número de pares clave-valor almacenado en el map.
	.isEmpty()				//Devuelve true si el map está vacío.
	.clear()				//Vacía el map.		

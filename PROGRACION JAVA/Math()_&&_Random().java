//METODOS MAS COMUNES de Math():
	abs()		//Devuelve el valor absoluto de un número.
	pow()		//Devuelve el valor de un número elevado a una potencia.
	sqrt()		//Devuelve la raíz cuadrada de un número.
	round()		//Redondea un número a un número entero.
	ceil()		//Devuelve el siguiente número entero mayor o igual que el número dado.
	floor()		//Devuelve el siguiente número entero menor o igual que el número dado.
	random()	//Devuelve un número aleatorio entre 0 y 1.
	min()		//Devuelve el mínimo entre 2 valores.
	max()		//Devuelve el máximo entre 2 valores.

	Math.abs(-10)		// 10
	Math.pow(10, 2)		// 100.0
	Math.sqrt(16)		// 4.0
	Math.round(1.5)		// 2
	Math.ceil(1.5)		// 2.0
	Math.floor(1.5)		// 1.0
	Math.random()		// 0.5395456223848742
	Math.min(10, 20)	// 10
	Math.max(10, 20)	// 20

//Random():
	//Generar un número entero aleatorio entre 0 y 100
	int numero = new Random().nextInt(101);
	int numero = new Random().nextInt(0, 101);

	//Generar un número decimal aleatorio entre 0 y 1
	double decimal = new Random().nextDouble();

	//Generar un booleano aleatorio
	boolean aleatorio = new Random().nextBoolean();

	// Generar un número largo aleatorio (64 bits)
	long numeroLargo = new Random().nextLong();
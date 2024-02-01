USE ciclismo;

-- EJERCICIO 1. Selecciona el nombre y el director de los equipos cuya edad media de ciclistas sea superior a 31. (2 puntos)
SELECT e.nomeq, director FROM ciclista c, equipo e WHERE c.nomeq = e.nomeq GROUP BY e.nomeq HAVING AVG(edad) > 31;

/*
EJERCICIO 2. Obtén el nombre de la ciudad de llegada con las letras invertidas 
y muestra solo las letras en las posiciones 3, 4 y 5 del nombre de la ciudad de salida. 
Además, etiqueta la primera columna como 'transformacion1' y la segunda columna como 'transformacion2'. 
Como condición adicional, únicamente debes mostrar las etapas 
donde tanto la ciudad de salida como la de llegada contengan la letra 'a'." (2 puntos)
*/
SELECT REVERSE(llegada) AS transformacion1, SUBSTRING(salida, 3, 3) AS transformacion2 FROM etapa WHERE salida LIKE '%a%' AND llegada LIKE '%a%';


/*
EJERCICIO 3. Muestra el color de todos los maillots que no sean de color rojo ni verde. 
Devuelve el resultado ordenado de manera descendente y en mayúsculas, 
e intercambiando en dicho nombre la cadena “a” por “aaa”. (1 punto)
*/
SELECT UPPER(REPLACE(color, 'a', 'aaa')) FROM maillot WHERE color NOT LIKE 'rojo' AND color NOT LIKE 'verde' ORDER BY color DESC;

/*
EJERCICIO 4. Encuentra los nombres de los ciclistas que han llevado el maillot de color rosa y cuyo nombre contiene la letra 'i'. 
Asegúrate de evitar duplicados en los resultados. (2 puntos)
*/
SELECT DISTINCT nombre FROM ciclista c, llevar ll, maillot m WHERE (c.dorsal = ll.dorsal) AND (ll.codigo = m.codigo) AND color='rosa' AND nombre LIKE '%i%';

-- EJERCICIO 5. Modifica la tabla equipo, poniendo tu nombre en el equipo "Wordperfect". (1 punto)
UPDATE equipo SET director = 'Richard' WHERE nomeq = 'Wordperfect';

/* 
EJERCICIO 6. Realiza una inserción en la tabla ciclista con la siguiente información: (1 punto)
- dorsal: "1111"
- nombre: ....
- nomeq: "Wordperfect"
*/
INSERT INTO ciclista VALUES ('1111', 'Richard', 40, 'Wordperfect');

-- EJERCICIO 7. Elimina la última entrada que has añadido. (1 punto)
DELETE FROM ciclista WHERE dorsal = '1111';
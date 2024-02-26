-- EJERCICIO 1. Obtener el dorsal y el nombre de los ciclistas que hayan ganado alguna etapa, mostrando el número de etapas que han ganado.
SELECT c.dorsal, nombre, COUNT(*) AS 'Etapas ganadas'
FROM ciclista c
JOIN etapa e ON c.dorsal = e.dorsal
GROUP BY c.dorsal

-- EJERCICIO 2. Obtener el nombre y la edad de los ciclistas que han llevado dos o más maillots en una misma etapa.
SELECT c.nombre, c.edad
FROM ciclista c
JOIN llevar ll ON c.dorsal = ll.dorsal
GROUP BY ll.netapa, ll.dorsal HAVING COUNT(ll.codigo) >= 2;

-- EJERCICIO 3. Obtener el nombre de los equipos que tengan más de 5 ciclistas.
SELECT nomeq
FROM ciclista
GROUP BY nomeq HAVING COUNT(dorsal)>5

-- EJERCICIO 4. Obtener el nombre de los ciclistas que han ganado más de un puerto.
SELECT c.nombre
FROM ciclista c
JOIN puerto p ON c.dorsal = p.dorsal
GROUP BY p.dorsal HAVING COUNT(p.nompuerto) > 1

-- EJERCICIO 5. Obtener el valor del atributo netapa de aquellas etapas tales que todos los puertos que están en ellas tienen más de 700 metros de altura.
SELECT netapa
FROM puerto
GROUP BY netapa HAVING MIN(altura)>700
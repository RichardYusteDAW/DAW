/*
El programa solicitará al usuario ingresar nombres y edades, y luego realizará las siguientes operaciones:
- Mostrar el mapa original.
- Mostrar el mapa ordenado por el nombre en orden alfabético.
- Mostrar el mapa ordenado por los valores de menor a mayor.
- Eliminar las entradas donde la edad sea menor o igual a 18.
- Calcular y mostrar la edad promedio de las personas en el mapa.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        showMap(map);

        showMap(orderNameMap(map));

        orderAgeMap(map);
        showMap(map);

        orderMapByValues(map);
    }

    public static Map<String, Integer> createMap() {
        // Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("name" + i, i + 18);
        }

        // for (int i = 0; i < 10; i++) {
        // System.out.print("Dime un nombre: ");
        // String name = in.nextLine();

        // System.out.print("Dime una edad: ");
        // int age = in.nextInt();
        // in.nextLine();

        // map.put(name, age);
        // }
        // in.close();

        return map;
    }

    public static void showMap(Map<String, Integer> map) {
        System.out.println(map);
    }

    public static Map<String, Integer> orderNameMap(Map<String, Integer> map) {
        Map<String, Integer> orderNameMap = new TreeMap<>(map);
        return orderNameMap;
    }

    public static Map<String, Integer> orderAgeMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();

        for (int i = 0; i < map.size() - 1; i++) {
            for (int j = i + 1; j < map.size(); j++) {

                String key_i = (String) keys.toArray()[i];
                String key_j = (String) keys.toArray()[j];
                Integer value_i = map.get(keys.toArray()[i]);
                Integer value_j = map.get(keys.toArray()[j]);

                if (value_i > value_j) {
                    Integer temp = value_i;
                    map.put(key_i, value_j);
                    map.put(key_j, temp);
                }
            }
        }
        return map;
    }

    public static Map<String, Integer> orderMapByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        showMap(sortedMap); // Muestra el mapa ordenado por valores
        return sortedMap;
    }

}

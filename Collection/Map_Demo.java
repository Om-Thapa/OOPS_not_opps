import java.util.*;

public class Map_Demo {
    public static void main(String[] args) {

        // Create Map
        Map<Integer, String> map = new HashMap<>();

        // put(K key, V value)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("Map: " + map);

        // get(Object key)
        System.out.println("Get key 2: " + map.get(2));

        // containsKey(Object key)
        System.out.println("Contains key 3? " + map.containsKey(3));

        // containsValue(Object value)
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));
    }
}
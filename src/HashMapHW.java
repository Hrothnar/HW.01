import java.util.HashMap;

public class HashMapHW {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void addToMap(String key, Integer value) {
        if (map.containsKey(key)) {
            if (!map.get(key).equals(value))
//                map.replace(key, value);
                map.put(key, value);
            else
                throw new RuntimeException("Данные идентичны");
        } else
            map.put(key, value);
        System.out.println(map.keySet() + " " + map.values());
    }


}

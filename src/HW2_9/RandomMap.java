package HW2_9;

import java.util.HashMap;

public class RandomMap {
    private static HashMap<String, Integer> vault = new HashMap<>();

    public static void addToMap(String key, Integer value) {
        if (vault.containsKey(key) && vault.get(key).equals(value)) {
            throw new RuntimeException("Данные идентичны");
        } else {
            vault.put(key, value);
        }
        System.out.println(vault.keySet() + " " + vault.values());
    }


}

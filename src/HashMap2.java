import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {
    public static Map<String, List<Integer>> map1 = new HashMap<>();
    public static Map<String, Integer> map2 = new HashMap<>();
    private static final String[] KEYS = new String[]{"STR1", "STR2", "STR3", "STR4", "STR5"};

    public static void showChangedMap() {
        getRandomMap();
        for (String key : map1.keySet()) {
            int sum = 0;
            for (Integer number : map1.get(key))
                sum += number;
            map2.put(key, sum);
        }
        System.out.println(map2);
    }

    private static void getRandomMap() {
        for (int r = 0; r < 5; r++) {
            int i = 1 + (int) (Math.random() * 1000);
            int g = 1 + (int) (Math.random() * 1000);
            int h = 1 + (int) (Math.random() * 1000);
            map1.put(KEYS[r], List.of(i, g, h));
        }
    }

}

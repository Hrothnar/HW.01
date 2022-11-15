import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_MAP_2_1 {
    private static Map<String, List<Integer>> map1 = new HashMap<>();
    private static Map<String, Integer> map2 = new HashMap<>();
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
        for (int i = 0; i < 5; i++) {
            int num1 = 1 + (int) (Math.random() * 1000);
            int num2 = 1 + (int) (Math.random() * 1000);
            int num3 = 1 + (int) (Math.random() * 1000);
            map1.put(KEYS[i], List.of(num1, num2, num3));
        }
    }

}

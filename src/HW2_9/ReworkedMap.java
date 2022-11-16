package HW2_9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReworkedMap {
    private static Map<String, List<Integer>> primalMap = new HashMap<>();
    private static Map<String, Integer> changedMap = new HashMap<>();
    private static final String[] KEYS = new String[]{"STR1", "STR2", "STR3", "STR4", "STR5"};

    public static void showChangedMap() {
        getRandomMap();
        for (String key : primalMap.keySet()) {
            int sum = 0;
            for (Integer number : primalMap.get(key))
                sum += number;
            changedMap.put(key, sum);
        }
        System.out.println(changedMap);
    }

    private static void getRandomMap() {
        for (int i = 0; i < 5; i++) {
            int num1 = 1 + (int) (Math.random() * 1000);
            int num2 = 1 + (int) (Math.random() * 1000);
            int num3 = 1 + (int) (Math.random() * 1000);
            primalMap.put(KEYS[i], List.of(num1, num2, num3));
        }
    }

}

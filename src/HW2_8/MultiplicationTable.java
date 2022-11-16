package HW2_8;

import java.util.HashSet;
import java.util.Set;

public class MultiplicationTable {

    public static void showTable() {
        Set<NumbersForMultiplicationTable> examples = new HashSet<>();
        boolean b = true;
        while (examples.size() < 15) {
            int i = (int) (Math.random() * 8) + 2;
            int j = (int) (Math.random() * 8) + 2;
            examples.add(new NumbersForMultiplicationTable(i, j));
        }
        for (NumbersForMultiplicationTable one : examples) {
            System.out.println(one);
        }
    }


}

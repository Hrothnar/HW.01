import java.util.HashSet;
import java.util.Set;

public class Table {

    public static void table() {
        Set<NumbersForTable> examples = new HashSet<>();
        boolean b = true;
        while (examples.size() < 15) {
            int i = (int) (Math.random() * 8) + 2;
            int j = (int) (Math.random() * 8) + 2;
            examples.add(new NumbersForTable(i, j));
        }
        for (NumbersForTable one : examples) {
            System.out.println(one);
        }
    }


}

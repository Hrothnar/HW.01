import java.util.HashSet;
import java.util.Set;

public class HW_SET_3_2_First {

    public static void table() {
        Set<HW_SET_3_2_Second> examples = new HashSet<>();
        boolean b = true;
        while (examples.size() < 15) {
            int i = (int) (Math.random() * 8) + 2;
            int j = (int) (Math.random() * 8) + 2;
            examples.add(new HW_SET_3_2_Second(i, j));
        }
        for (HW_SET_3_2_Second one : examples) {
            System.out.println(one);
        }
    }


}

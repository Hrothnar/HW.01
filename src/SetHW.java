import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHW {
    public static void randomSet() {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; list.size() < 20; i++) {
            int num = (int) (Math.random() * 1000);
            list.add(num);
        }
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 != 0)
                iter.remove();
        }
        System.out.println(Arrays.toString(list.toArray()) + "   Размер: " + list.size());
    }



}

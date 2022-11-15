import java.util.ArrayList;
import java.util.List;

public class HW_LIST_2_3 {

    public static void showMatrix() {
        List<List<String>> matrix = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            matrix.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                matrix.get(i).add(j, "◯");
                if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    matrix.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j != 7)
                    System.out.print(matrix.get(i).get(j) + " ");
                else
                    System.out.print(matrix.get(i).get(j) + "\n");
            }
        }
    }


}

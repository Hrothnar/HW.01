import java.util.ArrayList;
import java.util.List;

public class ChessTable {

    static void matrix() {
        List<List<String>> matrix = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            matrix.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        matrix.get(i).add(j, "◯");
                    else
                        matrix.get(i).add(j, "●");
                } else {
                    if (j % 2 != 0)
                        matrix.get(i).add(j, "◯");
                    else
                        matrix.get(i).add(j, "●"); // можно сократить, изначально заполнив массив одним типом полей
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

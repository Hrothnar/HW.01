package HW2_7;

import java.util.ArrayList;
import java.util.List;

public class ChessField {

    public static void showField() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, "◯");
                if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    biDemArrList.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j != 7)
                    System.out.print(biDemArrList.get(i).get(j) + " ");
                else
                    System.out.print(biDemArrList.get(i).get(j) + "\n");
            }
        }
    }


}

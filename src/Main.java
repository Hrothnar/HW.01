import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        SetHW.randomSet();
        Table.table();
        ChessTable.matrix();

        // ============================================================================= //

        Passport igor = new Passport("Игорь", "Валиев", null, "13.04.1995", "21444252");
        Passport vasya = new Passport("Вася", "Петров", "Захарович", "27.06.1992", "54288244");
        Passport elena = new Passport("Елена", "Котлова", "Владимировна", "06.06.1990", "92376335");
        Passport irina = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.1996", "77398872");
        Passport irinaNew = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.2002", "77388872");

        igor.addPassport(igor);
        vasya.addPassport(vasya);
        vasya.addPassport(vasya);
        elena.addPassport(elena);
        irina.addPassport(irina);
        irina.addPassport(irinaNew);

        System.out.println(Passport.getInfo(77398872));




    }


}
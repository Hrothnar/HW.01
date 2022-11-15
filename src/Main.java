import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ============================================================================= //
        //HW_LIST_2_3

        HW_LIST_2_3.showMatrix();

        // ============================================================================= //
        //HW_SET_2_2

        HW_SET_2_2.randomSet();

        // ============================================================================= //
        //HW_SET_3_2

        HW_SET_3_2_First.table();

        // ============================================================================= //
        //HW_SET_3_3

//        Passport igor = new Passport("Игорь", "Валиев", null, "13.04.1995", "21444252");
//        Passport vasya = new Passport("Вася", "Петров", "Захарович", "27.06.1992", "54288244");
//        Passport elena = new Passport("Елена", "Котлова", "Владимировна", "06.06.1990", "92376335");
//        Passport irina = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.1996", "77398872");
//        Passport irinaNew = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.2002", "77388872");
//
//        igor.addPassport(igor);
//        vasya.addPassport(vasya);
//        vasya.addPassport(vasya);
//        elena.addPassport(elena);
//        irina.addPassport(irina);
//        irina.addPassport(irinaNew);
//
//        System.out.println(Passport.getInfo(77398872));

        // ============================================================================= //
        // HW_MAP_1.1

        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Василий Петров", "+7(913)233-44-76");
        phonebook.put("Игорь Николаев", "+7(926)457-82-16");
        phonebook.put("Ольга Кастрюлина", "+7(999)683-56-67");
        phonebook.put("Елена Фарш", "+7(929)564-25-87");
        phonebook.put("Надежда Бабкина", "+7(929)965-34-73");
        phonebook.put("Кирилл Мясников", "+7(926)234-76-21");
        phonebook.put("Варфаламей Ночев", "+7(999)666-66-66");
        phonebook.put("Никола Тесла", "+7(999)132-32-23");
        phonebook.put("Джеймс Бондов", "+7(007)007-77-77");
        phonebook.put("Джордано Бруно", "+7(903)242-42-56");
        phonebook.put("Галлилео Галлилей", "+7(234)453-78-23");
        phonebook.put("Жанна Д'арк", "+7(223)452-96-29");
        phonebook.put("Альберт Эйнштейн", "+7(934)112-34-65");
        phonebook.put("Алан Тьюринг", "+7(452)655-65-34");
        phonebook.put("Джорж Вашингтон", "+7(237)857-45-68");
        phonebook.put("Брюс Уилес", "+7(245)345-93-34");
        phonebook.put("Александр Македонский", "+7(888)456-56-81");
        System.out.println(phonebook.values());

        // ============================================================================= //
        // HW_MAP_1.3

        HW_MAP_1_3.addToMap("STR1", 1);
        HW_MAP_1_3.addToMap("STR1", 3);
        HW_MAP_1_3.addToMap("STR1", 1);
        HW_MAP_1_3.addToMap("STR2", 5);
        HW_MAP_1_3.addToMap("STR2", 6);
        HW_MAP_1_3.addToMap("STR3", 2);
        HW_MAP_1_3.addToMap("STR3", 4);
        HW_MAP_1_3.addToMap("STR2", 6);

        // ============================================================================= //
        // HW_MAP_2.1

        HW_MAP_2_1.showChangedMap();

        // ============================================================================= //
        // HW_MAP_2.2

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(12, "True");
        map.put(523, "Covered");
        map.put(17, "Autumn");
        map.put(384, "Time");
        map.put(726, "Legacy");
        map.put(331, "Destiny");
        map.put(58, "Ahead");
        map.put(264, "Other");
        map.put(25, "Current");
        map.put(7, "Cup");
        System.out.println(map.toString().replace("=", ":").replace("{", "").replace("}", "").replace(",", "").replace(" ", "\n"));
        //засчитывается?)                     (если что, я могу и по-человечески)


    }


}
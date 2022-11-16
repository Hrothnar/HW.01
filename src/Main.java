import HW2_9.RandomMap;
import HW2_9.ReworkedMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ChessField.showField();
//

//        EvenSet.showEvenSet();
//

//        MultiplicationTable.showTable();


//        Passport igor = new Passport("Игорь", "Валиев", null, "13.04.1995", "21444252");
//        Passport vasya = new Passport("Вася", "Петров", "Захарович", "27.06.1992", "54288244");
//        Passport elena = new Passport("Елена", "Котлова", "Владимировна", "06.06.1990", "92376335");
//        Passport irina = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.1996", "77398872");
//        Passport irinaNew = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.2002", "77388872");
//        igor.addPassport(igor);
//        vasya.addPassport(vasya);
//        vasya.addPassport(vasya);
//        elena.addPassport(elena);
//        irina.addPassport(irina);
//        irina.addPassport(irinaNew);
//        System.out.println(Passport.getInfo(77398872));


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
        System.out.println(phonebook);


        RandomMap.addToMap("STR1", 1);
        RandomMap.addToMap("STR1", 3);
        RandomMap.addToMap("STR1", 1);
        RandomMap.addToMap("STR2", 5);
        RandomMap.addToMap("STR2", 6);
        RandomMap.addToMap("STR3", 2);
        RandomMap.addToMap("STR3", 4);
        RandomMap.addToMap("STR2", 6);


        ReworkedMap.showChangedMap();


        Map<Integer, String> trainingMap = new LinkedHashMap<>();
        trainingMap.put(12, "True");
        trainingMap.put(523, "Covered");
        trainingMap.put(17, "Autumn");
        trainingMap.put(384, "Time");
        trainingMap.put(726, "Legacy");
        trainingMap.put(331, "Destiny");
        trainingMap.put(58, "Ahead");
        trainingMap.put(264, "Other");
        trainingMap.put(25, "Current");
        trainingMap.put(7, "Cup");
        System.out.println(trainingMap.toString().replace("=", ":").replace("{", "").replace("}", "").replace(",", "").replace(" ", "\n"));



    }


}
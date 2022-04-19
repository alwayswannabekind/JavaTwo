package Lesson3;

import java.lang.reflect.Array;
import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {

        String[] array1 = new String[]{
         "sun", "tree", "house", "sky", "car", "window", "plane", "man", "tree", "house"
        };

        Map<String, Integer> array1Words = new HashMap<>();
        for (String word : array1) {

            Integer wordsCount = array1Words.getOrDefault(word, 0);
            array1Words.put(word, ++wordsCount);
        }

        for (Map.Entry<String, Integer> entry : array1Words.entrySet()) {
            System.out.printf("Word %s repeats %d time(s) %n", entry.getKey(), entry.getValue());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Task 2");
        System.out.println("--------------------------------------------------");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pupkin", "5(07)065-91-94");
        phoneBook.add("Borisov", "09(389)665-60-51");
        phoneBook.add("Ivanov", "02(5382)898-71-82");
        phoneBook.add("Ivanov", "8(5928)084-71-04");

        Set<String> surnames = phoneBook.allSurnames();
        for (String surname : surnames) {
                System.out.printf("User %s has phone number(s): %s %n", surname, phoneBook.get(surname));
        }
    }

}


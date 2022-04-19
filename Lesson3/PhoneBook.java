package Lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, Set<String>> phonesAndSurnames = new TreeMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phones = phonesAndSurnames.getOrDefault(surname, new HashSet<>());
        phones.add(phoneNumber);
        phonesAndSurnames.put(surname, phones);
    }

    public Set<String> get(String surname) {
        return phonesAndSurnames.get(surname);
    }

    public Set<String> allSurnames() {
        return phonesAndSurnames.keySet();
    }

}

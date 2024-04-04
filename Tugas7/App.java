package Tugas7;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Contact<Integer> contact1 = new Contact<>("John", 012345);
        Contact<String> contact2 = new Contact<>("Doe", "987654321");
        Contact<Double> contact3 = new Contact<>("Alice", 123456.0);

        contact1.info();
        contact2.info();
        contact3.info();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        DataProcessor.printArrayList(numbers);

        HashMap<String, String> hewan = new HashMap<>();
        hewan.put("Sapi", "Herbivora");
        hewan.put("Ayam", "Omnivora");
        hewan.put("Harimau", "Karnivora");

        DataProcessor.printHashMap(hewan);
    }
}

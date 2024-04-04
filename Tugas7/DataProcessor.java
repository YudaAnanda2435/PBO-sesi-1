package Tugas7;

import java.util.ArrayList;
import java.util.HashMap;

public class DataProcessor {
    public static <T> void printArrayList(ArrayList<T> list) {
        System.out.println("ArrayList:");
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <K, V> void printHashMap(HashMap<K, V> map) {
        System.out.println("Daftar Jenis Hewan (HashMap):");
        for (K key : map.keySet()) {
            System.out.println("Hewan: " + key + ", Kategori: " + map.get(key));
        }
    }
}

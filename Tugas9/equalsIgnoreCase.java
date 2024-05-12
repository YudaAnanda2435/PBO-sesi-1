package Tugas9;

public class equalsIgnoreCase {

    public static void main(String[] args) {
        String string1 = "hai";
        String string2 = "hai";
        String string3 = "Hai";
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string3));
    }
}
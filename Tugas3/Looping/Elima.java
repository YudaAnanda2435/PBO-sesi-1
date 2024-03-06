//Buatlah looping untuk deret angka : 1 3 6 10 15 21 28 36
package Tugas3.Looping;

public class Elima {
    public static void main(String[] args) {
        int n = 8;
        int angka = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(angka + " ");
            angka = angka + i + 1;
        }
    }
}

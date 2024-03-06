package Tugas3.bangundatar.lingkaran;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Membuat objek Lingkaran
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.setNama("Lingkaran");

            System.out.print("Masukkan jari-jari lingkaran: ");
            lingkaran.setJariJari(input.nextDouble());
            lingkaran.hitungLuas();
            lingkaran.hitungKeliling();

            // Menampilkan informasi lingkaran
            System.out.println("Informasi Lingkaran:");
            System.out.println("Nama: " + lingkaran.getNama());
            System.out.println("Luas: " + lingkaran.getLuas());
            System.out.println("Keliling: " + lingkaran.getKeliling());
        }
    }
}

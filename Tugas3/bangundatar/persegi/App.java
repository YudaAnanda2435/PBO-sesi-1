    package Tugas3.bangundatar.persegi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek Persegi
        Persegi persegi = new Persegi();
        persegi.setNama("Persegi");

        try {
            System.out.print("Masukkan panjang sisi persegi: ");
            double sisi = input.nextDouble();
            persegi.setSisi(sisi);

            persegi.hitungLuas();
            persegi.hitungKeliling();

            // Menampilkan informasi persegi
            System.out.println("Informasi Persegi:");
            System.out.println("Nama: " + persegi.getNama());
            System.out.println("Luas: " + persegi.getLuas());
            System.out.println("Keliling: " + persegi.getKeliling());
        } catch (Exception e) {
            System.out.println("Error: Masukan tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            input.close(); // Pastikan untuk menutup scanner setelah digunakan
        }
    }
}

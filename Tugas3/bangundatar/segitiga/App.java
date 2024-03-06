// Tugas3/bangundatar/App.java
package Tugas3.bangundatar.segitiga;



import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan segitiga
        System.out.println("Pilih jenis segitiga:");
        System.out.println("1. Segitiga Sama Sisi");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Segitiga Siku-Siku");
        System.out.println("4. Segitiga Sembarang");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungSegitigaSamaSisi(input);
                break;
            case 2:
                hitungSegitigaSamaKaki(input);
                break;
            case 3:
                hitungSegitigaSikuSiku(input);
                break;
            case 4:
                hitungSegitigaSembarang(input);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private static void hitungSegitigaSamaSisi(Scanner input) {
        SamaSisi segitiga = new SamaSisi();
        segitiga.setNama("Segitiga Sama Sisi");

        System.out.print("Masukkan panjang sisi segitiga sama sisi: ");
        segitiga.sisi = input.nextDouble();
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        segitiga.getInformasi();
    }

    private static void hitungSegitigaSamaKaki(Scanner input) {
        SamaKaki segitiga = new SamaKaki();
        segitiga.setNama("Segitiga Sama Kaki");

        System.out.print("Masukkan panjang alas segitiga sama kaki: ");
        segitiga.alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga sama kaki: ");
        segitiga.tinggi = input.nextDouble();
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        segitiga.getInformasi();
    }

    private static void hitungSegitigaSikuSiku(Scanner input) {
        SikuSiku segitiga = new SikuSiku();
        segitiga.setNama("Segitiga Siku-Siku");

        System.out.print("Masukkan panjang alas segitiga siku-siku: ");
        segitiga.alas = (int) input.nextDouble();
        System.out.print("Masukkan tinggi segitiga siku-siku: ");
        segitiga.tinggi = (int) input.nextDouble();
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        segitiga.getInformasi();
    }

    private static void hitungSegitigaSembarang(Scanner input) {
        Sembarang segitiga = new Sembarang();
        segitiga.setNama("Segitiga Sembarang");

        System.out.print("Masukkan panjang sisi 1 segitiga sembarang: ");
        segitiga.sisi1 = input.nextDouble();
        System.out.print("Masukkan panjang sisi 2 segitiga sembarang: ");
        segitiga.sisi2 = input.nextDouble();
        System.out.print("Masukkan panjang sisi 3 segitiga sembarang: ");
        segitiga.sisi3 = input.nextDouble();
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        segitiga.getInformasi();
    }
}

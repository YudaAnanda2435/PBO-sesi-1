package menghitungSegitiga;
import java.util.Scanner;

public class HitungSegitiga {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Segitiga");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Pilihan :");
            System.out.println("A. Hitung Keliling");
            System.out.println("B. Hitung Luas");
            System.out.println("C. Exit");
            System.out.print("Masukkan pilihan : ");
            char pilihan = input.next().charAt(0);

            switch (Character.toUpperCase(pilihan)) {
                case 'A':
                    hitungDanTampilkan("Keliling", input);
                    break;
                case 'B':
                    hitungDanTampilkan("Luas", input);
                    break;
                case 'C':
                    exit = true;
                    System.out.println("Terima Kasih, Program telah Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
    private static void hitungDanTampilkan(String jenis, Scanner input) {
        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = input.nextDouble();

        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = input.nextDouble();

        System.out.print("Masukkan panjang sisi C: ");
        double sisiC = input.nextDouble();

        if (jenis.equals("Keliling")) {
            double keliling = hitungKeliling(sisiA, sisiB, sisiC);
            System.out.println("Keliling segitiga: " + keliling);
        } else if (jenis.equals("Luas")) {
            double luas = hitungLuas(sisiA, sisiB, sisiC);
            System.out.println("Luas segitiga: " + luas);
        }
    }

    //keliling segitiga
    private static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // luas segitiga
    private static double hitungLuas(double sisiA, double sisiB, double sisiC) {
        double semiPerimeter = hitungKeliling(sisiA, sisiB, sisiC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sisiA) * (semiPerimeter - sisiB) * (semiPerimeter - sisiC));
    }
}

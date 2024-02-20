package thLahir;
import java.util.Scanner;
import java.time.Year;
public class Kelahiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Java Menghitung Umur");
        boolean exit = false;
        while (!exit) {
            System.out.print("Masukkan nama anda: ");
            String nama = input.nextLine();
            System.out.print("Masukkan tahun lahir anda: ");
            int tahunLahir = input.nextInt();
            int tahunSekarang = Year.now().getValue();
            int umur = tahunSekarang - tahunLahir;
            input.nextLine(); 
            System.out.println("Hallo " + nama + ", umur anda sekarang " + umur + " tahun.");
            System.out.print("Apakah ingin menghitung kembali? (y/n): ");
            String jawaban = input.nextLine();
            if ("n".equalsIgnoreCase(jawaban)) {
                exit = true;
                System.out.println("Terima kasih. Jangan Ragu Untuk Menghitung Kembali");
            }
        }
        input.close();
    }
}


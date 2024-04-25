// File: game/Main.java
package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo selamat datang di game gaje");
        System.out.println("anda sepertinya orang yang pintar dan cerdik😁");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Silahkan pilih TRUTH or DARE?");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("DARE")) {
                System.out.println("Ohhh tidak bisa, anda harus memilih TRUTH");
                continue;
            } else if (choice.equals("TRUTH")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silahkan pilih TRUTH atau DARE.");
            }
        }

        TruthOrDare game = new TruthOrDare();
        while (true) {
            System.out.println("Silahkan pilih tema:");
            System.out.println("1. Musik");
            System.out.println("2. Sepak Bola");
            System.out.println("3. Matematika");
            int themeChoice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            int result = game.askQuestion(themeChoice);
            if (result == 1) {
                System.out.println("Jawaban benar! Game selesai.");
                break;
            } else {
                System.out.println("Jawaban salah. Anda harus kembali memilih TRUTH atau DARE.");
            }
        }
        scanner.close();
    }
}

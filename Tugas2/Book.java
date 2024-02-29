package Tugas2;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books bookA = new Books("Yuda", "Laskar Pelangi", 20000.00, 1);
        Books bookB = new Books("Nina", "Nenek Kebayan", 100000.00, 2);
        Books bookC = new Books("Rani", "Ayahku Pahlawanku", 300000.00, 3);
        Books bookD = new Books("Nia", "Raksasa Naik Haji", 150000.00, 4);

        String informasiA = bookA.infromasi();
        System.out.println("\nInformasi buku " + informasiA);

        String informasiB = bookB.infromasi();
        System.out.println("\nInformasi buku " + informasiB);

        String informasiC = bookC.infromasi();
        System.out.println("\nInformasi buku " + informasiC);

        String informasiD = bookD.infromasi();
        System.out.println("\nInformasi buku " + informasiD);

        System.out.print("Masukkan jumlah buku (Laskar Pelangi) yang ingin dibeli: ");
        int banyakBukuA = scanner.nextInt();

        System.out.print("Masukkan jumlah buku (Nenek Kebayan) yang ingin dibeli: ");
        int banyakBukuB = scanner.nextInt();
        
        System.out.print("Masukkan jumlah buku (Ayahku Pahlawanku) yang ingin dibeli: ");
        int banyakBukuC = scanner.nextInt();

        System.out.print("Masukkan jumlah buku (Raksasa Naik Haji) yang ingin dibeli: ");
        int banyakBukuD = scanner.nextInt();

        double totalPrice = bookA.calculateBooks(banyakBukuA) + bookB.calculateBooks(banyakBukuB)
                + bookC.calculateBooks(banyakBukuC)
                + bookD.calculateBooks(banyakBukuD);
        System.out.println("Total pembelian buku : Rp." + totalPrice + '\n');

        scanner.close();
    }
}

class Books {
    private String author;
    private String title;
    private double price;
    private int publisher_number;

    public Books(String author, String title, double price, int publisher_number) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPublisher_number() {
        return this.publisher_number;
    }

    public double calculateBooks(int jumlahBuku) {
        return jumlahBuku * this.price;
    }

    public String infromasi() {
        return '\n' +
                "author          : " + author + '\n' +
                "title           : " + title + '\n' +
                "price           : " + price + '\n' +
                "publisherNumber : " + publisher_number + '\n';
    }
}
import shape.*;
import geometri.*;

public class App {
    public static void main(String[] args) {
        Shape persegiPanjang = new PersegiPanjang(5, 4);
        Shape persegi = new Persegi(5);
        Shape lingkaran = new Lingkaran(7);
        Shape segitigaSamaKaki = new SegitigaSamaKaki(6, 5);
        Shape segitigaSamaSisi = new SegitigaSamaSisi(5);
        Shape segitigaSikuSiku = new SegitigaSikuSiku(3, 4);
        Shape segitigaSembarang = new SegitigaSembarang(4, 5, 6);

        Geometri kubus = new Kubus(5);
        Geometri balok = new Balok(5, 4, 3);
        Geometri bola = new Bola(7);
        Geometri tabung = new Tabung(7, 10);
        

        System.out.println("=== Bentuk Datar ===");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("\nLuas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("\nLuas Lingkaran: " + String.format("%.2f", lingkaran.hitungLuas()));
        System.out.println("Keliling Lingkaran: " + String.format("%.2f", lingkaran.hitungKeliling()));
        System.out.println("\nLuas Segitiga Sama Kaki: " + segitigaSamaKaki.hitungLuas());
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.hitungKeliling());
        System.out.println("\nLuas Segitiga Sama Sisi: " + String.format("%.2f\n", segitigaSamaSisi.hitungLuas()));
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.hitungKeliling());
        System.out.println("\nLuas Segitiga Siku-Siku: " + segitigaSikuSiku.hitungLuas());
        System.out.println("Keliling Segitiga Siku-Siku: " + segitigaSikuSiku.hitungKeliling());
        System.out.println("\nLuas Segitiga Sembarang: " + String.format("%.2f\n", segitigaSembarang.hitungLuas()));
        System.out.println("Keliling Segitiga Sembarang: " + segitigaSembarang.hitungKeliling());

        System.out.println("\n=== Bangun Ruang ===");
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Bola: " + String.format("%.2f\n", bola.hitungVolume()));
        System.out.println("Volume Tabung: " + String.format("%.2f\n",tabung.hitungVolume()));
    }
}

package Tugas5;
// Segitiga.java
public class Segitiga {
    private double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double hitungLuasSamaSisi(double sisi) {
        return hitungLuas(sisi, (Math.sqrt(3) / 2) * sisi);
    }
}
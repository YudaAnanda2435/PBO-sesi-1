package Tugas3.bangundatar.persegi;

public class Persegi extends BangunDatar {
    protected double sisi;

    // Konstruktor default
    public Persegi() {
        super(); // Memanggil konstruktor superclass (BangunDatar)
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        super.luas = Math.pow(this.sisi, 2);
    }

    public void hitungKeliling() {
        super.keliling = 4 * this.sisi;
    }
}

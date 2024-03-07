package Tugas3.bangundatar.segitiga;

public class SamaKaki extends BangunDatar {
    protected double alas;
    protected double tinggi;

    // Konstruktor, setter, getter, dll. dapat ditambahkan sesuai kebutuhan

    public void hitungKeliling() {
        // Menghitung keliling dengan menggunakan 'super'
        super.keliling = 2 * this.alas + tinggi;
    }

    public void hitungLuas() {
        // Menghitung luas segitiga sama kaki dengan rumus luas segitiga biasa
        super.luas = 0.5 * this.alas * this.tinggi;
    }
}

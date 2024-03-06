package Tugas3.bangundatar.segitiga;


public class Sembarang extends BangunDatar {
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    // Konstruktor, setter, getter, dll. dapat ditambahkan sesuai kebutuhan

    public void hitungKeliling() {
        // Menghitung keliling dengan menggunakan 'super'
        super.keliling = this.sisi1 + this.sisi2 + this.sisi3;
    }

    public void hitungLuas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuas'");
    }
}




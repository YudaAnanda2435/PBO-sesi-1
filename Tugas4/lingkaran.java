package Tugas4;

public class Lingkaran extends BangunDatar {
    public Lingkaran(double radius){
        this.hitungLuas(radius);
        this.hitungKeliling(radius);
    }
    public void hitungLuas(double radius) {
        super.luas = 3.14 * radius * radius;
    }

    public void hitungKeliling(double radius) {
        super.keliling = 2 * 3.14 * radius;
    
    }
}
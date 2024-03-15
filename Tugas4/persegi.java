package Tugas4;

public class Persegi extends BangunDatar{
    public Persegi(double sisi){
        super.setNama("Persegi");
        this.hitungLuas(sisi);
        this.hitungKeliling(sisi);
    }
    public void hitungLuas(double sisi) {
        super.luas = sisi * sisi;
    }

    public void hitungKeliling(double sisi) {
        super.keliling = 4 * sisi;
    }
}

package Tugas3.bangundatar.segitiga;

public class SamaSisi extends BangunDatar {
    protected double sisi;

    public void hitungKeliling() {
        super.keliling = 3 * this.sisi;
    }

    public void hitungLuas() {
        super.luas = (Math.sqrt(3) / 4) * Math.pow(this.sisi, 2);
    }
}

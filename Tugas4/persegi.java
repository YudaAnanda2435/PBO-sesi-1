package Tugas4;

public class persegi extends Parentclass {
    protected double sisi;

    public void hitungKeliling() {
        super.keliling = 4 * sisi;
    }

    public void hitungLuas() {
        super.luas = sisi * sisi;
    }
}

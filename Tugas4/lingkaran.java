package Tugas4;

public class lingkaran extends Parentclass {
    protected double jariJari;

    public void hitungKeliling() {
        super.keliling = 2 * Math.PI * jariJari;
    }

    public void hitungLuas() {
        super.luas = Math.PI * jariJari * jariJari;
    }
}
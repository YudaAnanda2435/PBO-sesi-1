package Tugas3.bangundatar.lingkaran;

public class Lingkaran extends BangunDatar {
    protected double jariJari;

    public void hitungLuas() {
        super.luas = Math.PI * Math.pow(this.jariJari, 2);
    }

    public void hitungKeliling() {
        super.keliling = 2 * Math.PI * this.jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

}

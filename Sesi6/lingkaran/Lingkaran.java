package Sesi6.lingkaran;

public class Lingkaran extends BangunBundar {
    private double MathPI = 20;
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return MathPI * Math.pow(jariJari, 2);
    }

    public double keliling() {
        return 2 * MathPI * jariJari;
    }
}

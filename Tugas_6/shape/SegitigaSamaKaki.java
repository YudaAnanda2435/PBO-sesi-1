package shape;

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double sisi) {
        super(alas, sisi, sisi);
    }

    public double hitungLuas() {
        return 0.5 * sisi1 * Math.sqrt(Math.pow(sisi2, 2) - Math.pow(sisi1 / 2, 2));
    }

    public double hitungKeliling() {
        return sisi1 + 2 * sisi2;
    }
}

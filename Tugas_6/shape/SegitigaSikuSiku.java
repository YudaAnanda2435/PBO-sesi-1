package shape;

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
    }

    public double hitungLuas() {
        return 0.5 * sisi1 * sisi2;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

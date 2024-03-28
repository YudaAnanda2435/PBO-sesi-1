package shape;

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double sisi1, double sisi2, double sisi3) {
        super(sisi1, sisi2, sisi3);
    }

    public double hitungLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

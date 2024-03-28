package shape;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }

    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * Math.pow(sisi1, 2);
    }

    public double hitungKeliling() {
        return 3 * sisi1;
    }
}

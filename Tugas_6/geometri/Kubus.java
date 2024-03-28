package geometri;
import shape.Persegi;

public class Kubus extends Persegi implements Geometri {
    public Kubus(double sisi) {
        super(sisi);
    }

    public double hitungVolume() {
        return super.hitungLuas() * sisi;
    }

    public double hitungLuasPermukaan() {
        return super.hitungLuas() * 6;
    }
}

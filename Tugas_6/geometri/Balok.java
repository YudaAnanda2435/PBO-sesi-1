package geometri;
import shape.PersegiPanjang;

public class Balok extends PersegiPanjang implements Geometri {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + super.hitungKeliling() * tinggi);
    }
}

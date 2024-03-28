package geometri;

public class Tabung implements Geometri {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}

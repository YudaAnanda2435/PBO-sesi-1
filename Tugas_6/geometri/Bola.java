package geometri;

public class Bola implements Geometri {
    private double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

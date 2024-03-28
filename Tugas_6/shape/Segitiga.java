package shape;

public abstract class Segitiga implements Shape {
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
}

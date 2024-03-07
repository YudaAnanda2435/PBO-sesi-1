package Tugas4;

public class segitiga extends Parentclass {
    protected double alas;
    protected double tinggi;

    public void hitungKeliling() {
        super.keliling = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}


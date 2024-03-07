package Tugas4;
public class samasisi {
    public class samaSisi extends Parentclass {
    public void hitungLuas() {
        int alas;
        int tinggi;
        double s = (this.alas + this.tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        super.luas = Math.sqrt(s * (s - this.alas) * (s - this.tinggi) * (s - Math.sqrt(alas * alas + tinggi * tinggi)));
    }
}
}

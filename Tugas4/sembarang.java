package Tugas4;

public class sembarang extends Parentclass {
    int alas;
    int tinggi;
    public void hitungLuas() {
        

        double s = (this.alas + this.tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        super.luas = Math.sqrt(s * (s - this.alas) * (s - this.tinggi) * (s - Math.sqrt(alas * alas + tinggi * tinggi)));
    }
}
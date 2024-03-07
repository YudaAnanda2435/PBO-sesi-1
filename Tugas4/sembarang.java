package Tugas4; 
import java.lang.Math;
    public class sembarang extends Parentclass {
    public void hitungLuas() {
        double s = (this.alas + this.tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        super.luas = Math.sqrt(s * (s - this.alas) * (s - this.tinggi) * (s - Math.sqrt(alas * alas + tinggi * tinggi)));
    }
}


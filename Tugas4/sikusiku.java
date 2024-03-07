package Tugas4;

public class sikusiku {

public class sikuSiku extends Parentclass {
    public void hitungLuas() {
        double s = (this.alas + this.tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        super.luas = Math.sqrt(s * (s - this.alas) * (s - this.tinggi) * (s - Math.sqrt(alas * alas + tinggi * tinggi)));
    }
}
}

package Tugas3.bangundatar.segitiga;

public class SikuSiku extends BangunDatar {
    protected double sisi1;
    protected double sisi2;
    int alas;
    int tinggi;

    public void hitungKeliling() {
        super.keliling = this.alas + this.tinggi + Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
    }

    public void hitungLuas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuas'");
    }
}

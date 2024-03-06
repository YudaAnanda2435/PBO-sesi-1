package Tugas3.bangundatar.segitiga;
public class SamaKaki extends BangunDatar {
        protected double alas;
        protected double tinggi;
        protected double sisi1;
        protected double sisi2;
        protected double sisi3;

        public void hitungLuas() {
            super.luas = 0.5 * this.alas * this.tinggi;
        }

        public void hitungKeliling() {
            super.keliling = this.sisi1 + this.sisi2 + this.sisi3;
        }
        }
    

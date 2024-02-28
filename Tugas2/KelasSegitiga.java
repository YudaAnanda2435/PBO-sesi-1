package Tugas2;
public class KelasSegitiga {
    private double alas;
    private double tinggi;

  
    public KelasSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

 
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public static void main(String[] args) {
      
        KelasSegitiga segitigaA = new KelasSegitiga(8, 12);
    
        System.out.println("Luas Segitiga A: " + segitigaA.getLuas());

       
    }
}

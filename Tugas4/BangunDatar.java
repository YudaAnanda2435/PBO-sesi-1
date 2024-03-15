package Tugas4;

public class BangunDatar {
    protected double luas;
    protected double keliling;
    protected String nama;

    public double getLuas(){
        return this.luas;
    }

    public double getKeliling(){
        return this.keliling;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void getInfo(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Luas: " + this.luas);
        System.out.println("Keliling: " + this.keliling);
        System.out.println(" ");
    }
}

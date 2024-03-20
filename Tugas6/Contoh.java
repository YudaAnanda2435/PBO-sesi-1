package Tugas6;

// File: Contoh.java

public abstract class Contoh {
    private int nilaiPrivat;
    protected String teksDilindungi;
    public static final double PI = 3.14;

    public Contoh(int nilaiPrivat, String teksDilindungi) {
        this.nilaiPrivat = nilaiPrivat;
        this.teksDilindungi = teksDilindungi;
    }

    public void cetakNilaiPrivat() {
        System.out.println("Nilai Privat: " + nilaiPrivat);
    }

    protected void setCetakTeksDilindungi(String teks) {
        this.teksDilindungi = teks;
        System.out.println("Teks Dilindungi: " + teksDilindungi);
    }

    public abstract void metodeAbstrak();
}

class ContohTurunan extends Contoh {
    public ContohTurunan(int nilaiPrivat, String teksDilindungi) {
        super(nilaiPrivat, teksDilindungi);
    }

    public void aksesPropertiMetode() {
        teksDilindungi = "Teks dari kelas turunan";
        System.out.println("Teks Dilindungi dari Kelas Turunan: " + teksDilindungi);
        System.out.println("Nilai PI dari Kelas Turunan: " + PI);
        setCetakTeksDilindungi("Teks dari Kelas Turunan");
    }

    @Override
    public void metodeAbstrak() {
        System.out.println("Implementasi metode abstrak dari kelas turunan.");
    }
}

// Kelas utama Main untuk menjalankan contoh
class Main {
    public static void main(String[] args) {
        ContohTurunan objek = new ContohTurunan(10, "Contoh Teks");
        objek.aksesPropertiMetode();
        objek.metodeAbstrak();
    }
}

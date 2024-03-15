package Tugas4;

public class App {
    public static void main(String[] args) throws Exception {
        Segitiga segitigaSembarang = new Segitiga(3, 8, 10, 6, 8);
        segitigaSembarang.setNama("Segitiga Sembarang");
        segitigaSembarang.getInfo();

        Segitiga segitigaSikuSiku = new Segitiga(3, 8, 5, 4, 3);
        segitigaSikuSiku.setNama("Segitiga Siku-Siku");
        segitigaSikuSiku.getInfo();

        Segitiga segitigaSamaKaki = new Segitiga(3, 6, 4, 5, 5);
        segitigaSamaKaki.setNama("Segitiga Sama Kaki");
        segitigaSamaKaki.getInfo();

        Segitiga segitigaSamaSisi = new Segitiga(3, 8, 5, 5, 5);
        segitigaSamaSisi.setNama("Segitiga Sama Sisi");
        segitigaSamaSisi.getInfo();

        Persegi persegi = new Persegi(6);
        persegi.setNama("Persegi");
        persegi.getInfo();

        Lingkaran lingkaran = new Lingkaran(9);
        lingkaran.setNama("Lingkaran");
        lingkaran.getInfo();
    }
}

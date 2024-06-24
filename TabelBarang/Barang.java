package TabelBarang;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String kategoriBarang;
    private int hargaBarang;
    private int stokBarang;

    // Constructor tanpa parameter
    public Barang() {
    }

    // Constructor dengan parameter
    public Barang(String kodeBarang, String namaBarang, String kategoriBarang, int hargaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategoriBarang = kategoriBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
    }

    // Getter dan Setter untuk kodeBarang
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    // Getter dan Setter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // Getter dan Setter untuk kategoriBarang
    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    // Getter dan Setter untuk hargaBarang
    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // Getter dan Setter untuk stokBarang
    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }
}

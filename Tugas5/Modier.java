// Main.java
package Tugas5;

public class Modier {
    public static void main(String[] args) {

        // Menggunakan kelas Persegi (kelas public)
        Persegi persegi = new Persegi();
        double sisiPersegi = 5.0;
        double luasPersegi = persegi.hitungLuas(sisiPersegi);
        System.out.println("Luas Persegi dengan sisi " + sisiPersegi + " adalah: " + luasPersegi);
    }
}
        // Menggunakan kelas Segitiga (kelas private)
        // Ini akan menyebabkan error karena kelas Segitiga tidak bisa diakses dari luar paketnya
//         try {
//             Segitiga segitiga = new Segitiga();
//             double sisiSegitiga = 5.0;
//             double luasSegitiga = segitiga.hitungLuasSamaSisi(sisiSegitiga);
//             System.out.println("Luas Segitiga dengan sisi " + sisiSegitiga + " adalah: " + luasSegitiga);
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

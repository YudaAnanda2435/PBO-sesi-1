package Sesi6;

import Sesi6.bangundatar.Persegi;
import Sesi6.lingkaran.Lingkaran;
import Sesi6.shape.Square;
public class App {
    public static void main(String[] args) {
        Persegi A = new Persegi(5);
        Square B = new Square(5);
        Lingkaran C = new Lingkaran(8);

        A.getInfo();
        B.getInfo();
        C.getInfo();
    }
}

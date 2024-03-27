package Sesi6.lingkaran;

public abstract class BangunBundar {
    public abstract double luas();
    public abstract double keliling();

    public void getInfo (){
        System.out.println("luas: " + luas());
        System.out.println("keliling: " + keliling());
    }
}

package Sesi6.bangundatar;

public abstract class BangunDatar {
    public abstract double luas();

    public abstract double keliling();
    
    public void getInfo(){
        System.out.println("luas: " + luas());
        System.out.println("keliling: " + keliling());
    }
}

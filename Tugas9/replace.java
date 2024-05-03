package Tugas9;

public class replace {
    public static void main(String[] args) {
        String stringA = "Hello Barudak";
        String GantiKarakter = stringA.replace('H', 'B');
        String GantiKalimat = stringA.replace('Hello', 'Main Yuk');
        System.out.println("untuk karakter : "+GantiKarakter);
        System.out.println("untuk kalimat : "+GantiKalimat);
    }
}

package Tugas9;

public class replace {
    public static void main(String[] args) {
        String stringA = "Hello Barudak";
        String gantiKarakter = stringA.replace('H', 'B');
        String gantiKalimat = stringA.replace("Hello", "Main Yuk");
        System.out.println("Untuk karakter: " + gantiKarakter);
        System.out.println("Untuk kalimat: " + gantiKalimat);
    }
}


import java.util.Scanner;
public class Reamur {
    public static void main(String[] args) throws Exception {
        System.out.println("Program java");
        System.out.println("Konversi suhu Reamur");
        boolean exit = false;
        try (Scanner input = new Scanner(System.in)) {
            while (!exit) {
                System.out.println("Pilihan : ");
                System.out.println("A. Celcius");
                System.out.println("B. Fahrenheit");
                System.out.println("C. Kelvin");
                System.out.println("D. Exit");
                System.out.print("Jawaban : ");
                String Jawaban = input.nextLine();

                switch (Jawaban) {
                    case "A":
                        Celcius(input);
                        System.out.println();
                        break;
                    case "B":
                        Fahrenheit(input);
                        System.out.println();
                        break;
                    case "C":
                        Kelvin(input);
                        System.out.println();
                        break;
                    case "D":
                        exit = true;
                        System.out.println("Terima kasih. Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan salah!!!");
                }
            }
        }
    }

    private static void Celcius(Scanner input) {
        System.out.print("Masukkan Suhu Reamur : ");
        double suhuReamur = input.nextDouble();
        double suhuCelcius = (5.0 / 4.0) * suhuReamur;
        System.out.println(suhuReamur + " Suhu Reamur = " + suhuCelcius + " Derajat Celcius");
        input.nextLine();
    }

    private static void Fahrenheit(Scanner input) {
        System.out.print("Masukkan Suhu Reamur : ");
        double suhuReamur = input.nextDouble();
        double suhuFahrenheit = (9.0 / 5.0) * suhuReamur;
        System.out.print( suhuReamur + " Suhu Reamur = " + suhuFahrenheit + " Derajat Fahrenheit");
        input.nextLine();
    }

    private static void Kelvin(Scanner input) {
        System.out.print("Masukkan Suhu Reamur : ");
        double suhuReamur = input.nextDouble();
        double suhuCelcius = (5.0 / 4.0 * suhuReamur);
        double suhuKelvin = suhuCelcius + 273.15;
        System.out.println(suhuReamur + " Suhu Reamur = " + suhuKelvin + " Derajat Kelvin");
        input.nextLine();
        }
    }


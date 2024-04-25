import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion;

        do {
            System.out.println("Hallo selamat datang di aplikasi konversi satuan, Anda ingin mengkonversi apa?");
            System.out.println("1. Konversi satuan panjang");
            System.out.println("2. Konversi satuan berat");
            System.out.println("3. Konversi satuan waktu");
            System.out.println("4. Konversi satuan luas");
            System.out.println("5. Konversi satuan volume");

            System.out.print("Masukkan angka: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PanjangConverter panjangConverter = new PanjangConverter();
                    System.out.println("Anda memilih konversi satuan panjang.");
                    System.out.println("Pilih jenis konversi:");
                    System.out.println("1. Meter ke Kilometer");
                    System.out.println("2. Kilometer ke Meter");
                    System.out.print("Masukkan pilihan Anda: ");
                    int subChoice1 = scanner.nextInt();
                    if (subChoice1 == 1) {
                        System.out.print("Masukkan panjang dalam meter:");
                        double meter = scanner.nextDouble();
                        panjangConverter.setNilai(meter);
                        System.out.println("Hasil konversi: " + panjangConverter.meterToKilometer() + " kilometer");
                    } else if (subChoice1 == 2) {
                        System.out.print("Masukkan panjang dalam kilometer:");
                        double kilometer = scanner.nextDouble();
                        panjangConverter.setNilai(kilometer);
                        System.out.println("Hasil konversi: " + panjangConverter.kilometerToMeter() + " meter");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 2:
                    BeratConverter beratConverter = new BeratConverter();
                    System.out.println("Anda memilih konversi satuan berat.");
                    System.out.println("Pilih jenis konversi:");
                    System.out.println("1. Ton ke Kilogram");
                    System.out.println("2. Kilogram ke Ton");
                    System.out.print("Masukkan pilihan Anda: ");
                    int subChoice2 = scanner.nextInt();
                    if (subChoice2 == 1) {
                        System.out.print("Masukkan berat dalam ton:");
                        double ton = scanner.nextDouble();
                        beratConverter.setNilai(ton);
                        System.out.println("Hasil konversi: " + beratConverter.tonToKilogram() + " kilogram");
                    } else if (subChoice2 == 2) {
                        System.out.print("Masukkan berat dalam kilogram:");
                        double kilogram = scanner.nextDouble();
                        beratConverter.setNilai(kilogram);
                        System.out.println("Hasil konversi: " + beratConverter.kilogramToTon() + " ton");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 3:
                    WaktuConverter waktuConverter = new WaktuConverter();
                    System.out.println("Anda memilih konversi satuan waktu.");
                    System.out.println("Pilih jenis konversi:");
                    System.out.println("1. Jam ke Detik");
                    System.out.println("2. Detik ke Jam");
                    System.out.print("Masukkan pilihan Anda: ");
                    int subChoice3 = scanner.nextInt();
                    if (subChoice3 == 1) {
                        System.out.print("Masukkan waktu dalam jam:");
                        double jam = scanner.nextDouble();
                        waktuConverter.setNilai(jam);
                        System.out.println("Hasil konversi: " + waktuConverter.jamToDetik() + " detik");
                    } else if (subChoice3 == 2) {
                        System.out.print("Masukkan waktu dalam detik:");
                        double detik = scanner.nextDouble();
                        waktuConverter.setNilai(detik);
                        System.out.println("Hasil konversi: " + waktuConverter.detikToJam() + " jam");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 4:
                    LuasConverter luasConverter = new LuasConverter();
                    System.out.println("Anda memilih konversi satuan luas.");
                    System.out.println("Pilih jenis konversi:");
                    System.out.println("1. Meter Persegi ke Kilometer Persegi");
                    System.out.println("2. Kilometer Persegi ke Meter Persegi");
                    System.out.print("Masukkan pilihan Anda: ");
                    int subChoice4 = scanner.nextInt();
                    if (subChoice4 == 1) {
                        System.out.print("Masukkan luas dalam meter persegi:");
                        double meterPersegi = scanner.nextDouble();
                        luasConverter.setNilai(meterPersegi);
                        System.out.println("Hasil konversi: " + luasConverter.meterPersegiToKilometerPersegi() + " kilometer persegi");
                    } else if (subChoice4 == 2) {
                        System.out.print("Masukkan luas dalam kilometer persegi:");
                        double kilometerPersegi = scanner.nextDouble();
                        luasConverter.setNilai(kilometerPersegi);
                        System.out.println("Hasil konversi: " + luasConverter.kilometerPersegiToMeterPersegi() + " meter persegi");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 5:
                    VolumeConverter volumeConverter = new VolumeConverter();
                    System.out.println("Anda memilih konversi satuan volume.");
                    System.out.println("Pilih jenis konversi:");
                    System.out.println("1. Meter Kubik ke Liter");
                    System.out.println("2. Liter ke Meter Kubik");
                    System.out.print("Masukkan pilihan Anda: ");
                    int subChoice5 = scanner.nextInt();
                    if (subChoice5 == 1) {
                        System.out.print("Masukkan volume dalam meter kubik:");
                        double meterKubik = scanner.nextDouble();
                        volumeConverter.setNilai(meterKubik);
                        System.out.println("Hasil konversi: " + volumeConverter.meterKubikToLiter() + " liter");
                    } else if (subChoice5 == 2) {
                        System.out.print("Masukkan volume dalam liter:");
                        double liter = scanner.nextDouble();
                        volumeConverter.setNilai(liter);
                        System.out.println("Hasil konversi: " + volumeConverter.literToMeterKubik() + " meter kubik");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Apakah Anda ingin melanjutkan konversi? (Y/N)");
            String continueChoice = scanner.next();
            continueConversion = continueChoice.equalsIgnoreCase("Y");
        } while (continueConversion);

        System.out.println("Terima kasih telah menggunakan aplikasi konversi satuan.");
        scanner.close();
    }
}

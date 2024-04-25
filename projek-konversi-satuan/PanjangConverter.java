public class PanjangConverter extends Converter {
    public double meterToKilometer() {
        return getNilai() / 1000;
    }

    public double kilometerToMeter() {
        return getNilai() * 1000;
    }
}

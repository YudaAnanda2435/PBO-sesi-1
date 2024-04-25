public class LuasConverter extends Converter {
    public double meterPersegiToKilometerPersegi() {
        return getNilai() / 1000000;
    }

    public double kilometerPersegiToMeterPersegi() {
        return getNilai() * 1000000;
    }
}

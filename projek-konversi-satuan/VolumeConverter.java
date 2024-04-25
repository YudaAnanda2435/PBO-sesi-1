public class VolumeConverter extends Converter {
    public double meterKubikToLiter() {
        return getNilai() * 1000;
    }

    public double literToMeterKubik() {
        return getNilai() / 1000;
    }
}

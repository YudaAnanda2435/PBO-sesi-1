public class WaktuConverter extends Converter {
    public double jamToDetik() {
        return getNilai() * 3600;
    }

    public double detikToJam() {
        return getNilai() / 3600;
    }
}

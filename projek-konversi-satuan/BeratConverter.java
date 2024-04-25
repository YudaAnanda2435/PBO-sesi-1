public class BeratConverter extends Converter {
    public double tonToKilogram() {
        return getNilai() * 1000;
    }

    public double kilogramToTon() {
        return getNilai() / 1000;
    }
}

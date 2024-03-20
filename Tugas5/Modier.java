package Tugas5;


public class Modier {
    // Modifier Access: Public
    public int publicValue;

    // Modifier Access: Protected
    protected String protectedValue;

    // Modifier Access: Private
    private double privateValue;

    // Modifier Access: Default (Tidak ada modifier akses)
    int defaultValue;

    // Modifier Non-Access: Static
    public static int staticValue;

    // Modifier Non-Access: Final
    public final String finalValue = "Final value";

    // Modifier Non-Access: Abstract
    public abstract class AbstractExample {
        public abstract void abstractMethod();
    }

    // Constructor
    public Modier(int publicValue, String protectedValue, double privateValue, int defaultValue) {
        this.publicValue = publicValue;
        this.protectedValue = protectedValue;
        this.privateValue = privateValue;
        this.defaultValue = defaultValue;
    }

    // Public method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Default (Tidak ada modifier akses) method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    // Main method
    public static void main(String[] args) {
        // Menggunakan properti dan metode dalam kelas Example
        Modier example = new Modier(10, "Protected", 3.14, 5);
        System.out.println("Public Value: " + example.publicValue);
        System.out.println("Protected Value: " + example.protectedValue);
        System.out.println("Private Value: " + example.privateValue);
        System.out.println("Default Value: " + example.defaultValue);

        example.publicMethod();
        example.protectedMethod();
        example.privateMethod();
        example.defaultMethod();
        staticMethod();
        
        System.out.println("Final Value: " + example.finalValue);
    }
}

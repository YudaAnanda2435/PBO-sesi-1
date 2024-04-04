package Tugas7;

public class Contact<T> {
    private String name;
    private T phoneNumber;

    public Contact(String name, T phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

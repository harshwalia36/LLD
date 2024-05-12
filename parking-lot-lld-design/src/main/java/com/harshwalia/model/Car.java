package main.java.com.harshwalia.model;

public class Car {
    private String registerationNumber;
    private String color;

    public Car(final String registerationNumber, final String color) {
        this.registerationNumber = registerationNumber;
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registerationNumber;
    }

    public String getColor() {
        return color;
    }
}

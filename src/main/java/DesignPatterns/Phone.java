package DesignPatterns;


public class Phone {
    private String os;
    private int ram;
    private double screenSize;
    private String processor;

    public Phone(String os, int ram, double screenSize, String processor) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return this.os + " " +this.ram + " " +this.screenSize + " " + this.processor;
    }
}

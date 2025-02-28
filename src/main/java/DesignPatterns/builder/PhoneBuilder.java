package DesignPatterns.builder;

public class PhoneBuilder {
    private String name;
    private int ram;
    private String os;
    private int hardDisk;
    private double price;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }
    public PhoneBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public Phone getPhoneInstance() {
        return new Phone(name, ram, os, hardDisk, price);
    }
}

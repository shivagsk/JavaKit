package DesignPatterns.builder;

public class Phone {
    private String name;
    private int ram;
    private String os;
    private int hardDisk;
    private double price;

    public Phone(String name, int ram, String os, int hardDisk, double price) {
        this.name = name;
        this.ram = ram;
        this.os = os;
        this.hardDisk = hardDisk;
        this.price = price;
    }

    public String toString() {
        return this.name + " \n" + this.ram + " \n" + this.os + " \n" + this.hardDisk + " \n" +this.price;
    }

}

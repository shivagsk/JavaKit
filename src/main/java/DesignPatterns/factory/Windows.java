package DesignPatterns.factory;

public class Windows implements  OperatingSys {
    @Override
    public String sayHello() {
        return "Hello! from Windows";
    }
}

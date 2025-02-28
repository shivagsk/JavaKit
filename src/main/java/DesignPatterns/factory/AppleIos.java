package DesignPatterns.factory;


public class AppleIos  implements OperatingSys {
    @Override
    public String sayHello() {
        return "Hello! from IOS";
    }
}

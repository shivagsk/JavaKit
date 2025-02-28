package DesignPatterns.factory;

/*  Problems:
*   1. Tight Coupling to Specific Classes
*   2. Violation of Open/Closed Principle
*   Solution:
*   1. solves the problem of creating objects
*   without exposing the instantiation logic to the client.
*   2. Loose coupling
* */
public class FactoryPattern {
    public static void main(String[] args) {
        OperatingSysImpl operatingSys = new OperatingSysImpl();
        OperatingSys os = operatingSys.getInstance("Windows");
        System.out.println(os.sayHello());
    }
}

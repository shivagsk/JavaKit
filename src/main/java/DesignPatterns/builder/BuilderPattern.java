package DesignPatterns.builder;


/*
*   Prob: Telescoping Constructor | overloaded constructors | unreadable cause of multiple fields
*   Sol : Builder Pattern
* */
public class BuilderPattern {
    public static void main(String[] args) {
        Phone phone =  new PhoneBuilder()
                .setName("Samsung")
                .setRam(4).getPhoneInstance();
        System.out.println(phone);
    }
}

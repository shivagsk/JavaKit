package DesignPatterns;

import DesignPatterns.Builder.PhoneBuilder;

public class DesignPatterns {
    public static void main(String[] args) {

        // Singleton pattern
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.getString());
        obj.setString(obj.getString() + "SHiva" );
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.getString());
        System.out.println(obj == obj1);


        // Builder pattern
        Phone phone = new PhoneBuilder()
                .setOs("windows").getPhone();

        System.out.println(phone);


    }
}

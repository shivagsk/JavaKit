package DesignPatterns.singleton;


/*
*   Def : A class has only one instance and provides a global point of access to that instance.
*   Usage : It’s widely used for managing shared resources like configuration settings, logging,
*   database connections, or thread pools.
*
*
*
* */
public class SingletonPattern {
    public static void main(String[] args) {
          Thread t1 = new Thread(() -> SingletonClass.getInstance());
          Thread t2 = new Thread(() -> SingletonClass.getInstance());
//        SingletonClass singleton = SingletonClass.getInstance();
//        SingletonClass singletonClass = SingletonClass.getInstance();
//        System.out.print(singletonClass);
//        System.out.println(singletonClass == singleton);
//        Thread t1 = new Thread(() -> System.out.print(singleton.sayHello()));
//        Thread t2 = new Thread(() -> System.out.print(singleton.sayHello()));
        t1.start();
        t2.start();

    }
}

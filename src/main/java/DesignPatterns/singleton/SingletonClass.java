package DesignPatterns.singleton;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    private SingletonClass() {

    }
    public static SingletonClass getInstance() {
        System.out.println(Thread.currentThread().getName());
        if(INSTANCE == null) {
            System.out.println(Thread.currentThread().getName());
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

    public String sayHello() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        return Thread.currentThread().getName() + "Hello!";
    }
}


// double-check lock
 class SingletonClass1 {
    private static volatile SingletonClass1 INSTANCE;

    private SingletonClass1() {

    }

    public static SingletonClass1 getInstance() {
        System.out.println(Thread.currentThread().getName());
        if (INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonClass1();
                }
            }
        }
        return INSTANCE;
    }
}
package multiThreading;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

class EvenOdd  implements Serializable {
    public volatile int count = 0;
    public void printEven()  {
        synchronized (this) {
            while(count<=10) {
                if((count&1) == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(" Exception in printing even number" + count);
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " printing even :: " + count);
                    count+=1;
                    notify();
                }
            }
        }
    }

    public void printOdd() {
        synchronized (this) {
            while(count <= 10) {
                if( (count&1) == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        System.out.println("Error occurred in printing odd number :" +count);
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " printing odd :: " + count);
                    count+=1;
                    notifyAll();
                }
            }
        }
    }

}
public class EvenOddProb {
    public static void main(String[] args) {
        EvenOdd obj1 = new EvenOdd();
        EvenOdd obj2 = new EvenOdd();
        Thread thread1 = new Thread(() -> {
            obj1.printEven();
        });
        Thread thread2 = new Thread( () -> obj1.printOdd());
        //Thread thread3 = new Thread( () -> EvenOdd.printOdd());
        //Thread thread4 = new Thread( () -> obj2.printEven());
        thread1.start();
        thread2.start();
        //thread3.start();
        //thread4.start();
    }
}

class Singleton {
    private static volatile Singleton INSTANCE = null;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

class Single {
    private Single() {
    }
    private static class SingleHelper {
        private static final Single INSTANCE = new Single();
    }
    public static Single getInstance() {
        return SingleHelper.INSTANCE;
    }

}



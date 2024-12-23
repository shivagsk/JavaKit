package multiThreading;

class EvenOdd {
    public static int count = 0;
    public static synchronized void printEven()  {
//        synchronized (this) {
            while(count<=10) {
                if((count&1) == 1) {
                    try {
                        EvenOdd.class.wait();
                    } catch (Exception e) {
                        System.out.println(" Exception in printing even number" + count);
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " printing even :: " + count);
                    count+=1;
                    EvenOdd.class.notify();
                }
            }
        //}
    }

    public static synchronized void printOdd() {
        //synchronized () {
            while(count <= 10) {
                if( (count&1) == 0) {
                    try {
                        EvenOdd.class.wait();
                    } catch (Exception e) {
                        System.out.println("Error occurred in printing odd number :" +count);
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " printing odd :: " + count);
                    count+=1;
                    EvenOdd.class.notifyAll();
                }
            }
        //}
    }

}
public class EvenOddProb {
    public static void main(String[] args) {
        EvenOdd obj1 = new EvenOdd();
        EvenOdd obj2 = new EvenOdd();
        Thread thread1 = new Thread(() -> {
            EvenOdd.printEven();
        });
        //Thread thread2 = new Thread( () -> obj2.printOdd());
        Thread thread3 = new Thread( () -> EvenOdd.printOdd());
        //Thread thread4 = new Thread( () -> obj2.printEven());
        thread1.start();
        //thread2.start();
        thread3.start();
        //thread4.start();
    }
}

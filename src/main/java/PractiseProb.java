import java.util.function.BiPredicate;

interface GskFI<T>{
    boolean isEven(T a);
}

public class PractiseProb {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> evenSum = (a, b) -> (a+b)%2 == 0;

        System.out.println(evenSum.test(10,13));

        GskFI<Integer> even = (a) -> a%2==0;

        System.out.println(even.isEven(10));

    }
}

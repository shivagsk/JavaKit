import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Epam {
    public static void duplicateFinder(List<String> input) {
        Set<String> unique = new HashSet<>();
        input.stream().flatMap(str -> Stream.of(str.split(" ")))
                .filter( str -> !unique.add(str))
                .forEach(str -> System.out.println(str));
    }
    public static void moveDuplicatesToEnd(int[] arr) {
        int ind = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[ind++] = arr[i];
            }
        }
        for(int i=ind+1; i<arr.length; i++) {
            arr[i] = 0;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeros() {
        int[] arr = {0, 4, 1, 0, 0, 0, 0, 9, 0};
        //output    {4,1,9,0,0,0}
        int len = arr.length;
        int zeroIndex = 0;
        int nonZero = 0;
        int temp;
        while (zeroIndex < len && nonZero < len) {
            if (arr[zeroIndex] == 0 && arr[nonZero] != 0) {
                temp = arr[zeroIndex];
                arr[zeroIndex] = arr[nonZero];
                arr[nonZero] = temp;
                zeroIndex++;
                nonZero++;
            }
            if (arr[zeroIndex] != 0) {
                zeroIndex++;
            }
            if (arr[nonZero] == 0) {
                nonZero++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static boolean isPalindromeUsingStream(String str) {
        //.forEach(System.out::println);
        return IntStream.range(0, str.length()/2).allMatch(x -> str.charAt(x) == str.charAt(str.length()-x-1));
                //.boxed()
                //.collect(Collectors.toList()).size() == str.length()/2;
                //.forEach(System.out::print);
        //bsosa
    }
    public static void main(String[] args) {
        //System.out.println("Hello World");
        List<String> sentences = Arrays.asList(
                "Java 8 introduces functional programming",
                "Functional programming is powerful",
                "Learn Java 8 features"
        );

        //duplicateFinder(sentences);

        //moveZeros();

        int[] ar = new int[]{0, 4, 1, 0, 0, 55, 0, 9, 0};
        //moveDuplicatesToEnd(ar);

        String str = "abcd";
        System.out.println(isPalindromeUsingStream(str));
    }
}

package Collections;

import java.util.Arrays;

final class ImmutablePerson {
    private final String name;          // Immutable field
    private final int age;              // Immutable field
    private final int[] scores;         // Mutable field

    // Constructor with Deep Copy for mutable field
    public ImmutablePerson(String name, int age, int[] scores) {
        this.name = name;
        this.age = age;
        //this.scores = scores;
        // Deep copy of the scores array
        this.scores = scores != null ? Arrays.copyOf(scores, scores.length) : null;
    }

    // Getter for name (String is immutable, safe to return as-is)
    public String getName() {
        return name;
    }

    // Getter for age (primitives are immutable, safe to return as-is)
    public int getAge() {
        return age;
    }

    // Getter for scores (returning a deep copy to maintain immutability)
    public int[] getScores() {
        return scores != null ? Arrays.copyOf(scores, scores.length) : null;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", scores=" + Arrays.toString(scores) + "}";
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        int[] scores = {90, 85, 88};
        ImmutablePerson person = new ImmutablePerson("Alice", 25, scores);

        System.out.println("Original: " + person);

        // Attempt to modify the original array
        scores[0] = 100;
        System.out.println("After modifying original array: " + person);

        // Attempt to modify the scores through the getter
        int[] retrievedScores = person.getScores();
        retrievedScores[1] = 50;
        System.out.println("After modifying retrieved array: " + person);
    }
}




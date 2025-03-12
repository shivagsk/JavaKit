interface A {
    default void test() {
        System.out.println("in A");
    }
}

interface B {
    default void test() {
        System.out.println("in B");
    }
}

public class ExampleInterface implements A,B {
    @Override
    public void test() {
        A.super.test();
    }
}

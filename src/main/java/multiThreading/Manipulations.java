package multiThreading;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class Manipulations {
    CountDownLatch latch = new CountDownLatch(4);
    Map<Integer, String> map = new HashMap<>();


}

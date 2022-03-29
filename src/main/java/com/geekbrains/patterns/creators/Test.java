package com.geekbrains.patterns.creators;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    private static void runAsync() {
        MySingleton.getInstance("Hello world!");
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        try (MyPrototype origin = new MyPrototype(1, "s")) {
            origin.setSingleton(MySingleton.getInstance("Hello"));
            System.out.println(origin);
        } catch (IOException e) {
            e.printStackTrace();
        }

        MyList list = new MyList();

        for (Integer item : list) {
            System.out.println(item);
        }

        list.forEach(System.out::println);

        BuilderPojo pojo = BuilderPojo.builder()
                .i(1)
                .f(2)
                .h(3)
                .g(4)
                .build();

        MyClass myClass = MyClass.of(1, 2);

        Path.of("dir", "fileName.txt");
        List.of(1, 2, 3, 4);
        Set.of(1, 2, 3);
        Map.ofEntries(Map.entry(2, 2), Map.entry(1, 2));

        MyClassFactory factory = new MyClassFactory();

        factory.get();
        factory.get(1);
        factory.get(1, 2);


    }

    private static void testSingleton() {
        long start = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 10000000; i++) {
            service.submit(Test::runAsync);
        }

        service.shutdown();

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}

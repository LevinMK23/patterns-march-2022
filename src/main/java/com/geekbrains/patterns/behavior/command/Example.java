package com.geekbrains.patterns.behavior.command;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Example {

    private static AtomicInteger ai = new AtomicInteger();

    static Queue<Consumer<Object>> consumers = new ConcurrentLinkedQueue<>(
            List.of(
                    o -> System.out.println(ai.incrementAndGet() + " " + o + " action 1"),
                    o -> System.out.println(ai.incrementAndGet() + " " + o + " action 2"),
                    o -> System.out.println(ai.incrementAndGet() + " " + o + " action 3"),
                    o -> System.out.println(ai.incrementAndGet() + " " + o + " action 4")
            )
    );

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(8);

        while (!consumers.isEmpty()) {
            executor.execute(() -> {
                Consumer<Object> consumer = consumers.poll();
                if (consumer != null) {
                    consumer.accept("hello");
                }
            });
        }


    }
}

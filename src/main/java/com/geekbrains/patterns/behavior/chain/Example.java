package com.geekbrains.patterns.behavior.chain;

import java.util.Iterator;
import java.util.List;

public class Example {

    static String process(Iterator<ChainItem<String>> it, String o) {
        if (it.hasNext()) {
            ChainItem<String> processor = it.next();
            return process(it, processor.process(o));
        }
        return o;
    }

    public static void main(String[] args) {

        List<Processor> processors = List.of(
                System.out::println,
                o -> System.out.println(o.hashCode())
        );

        processors.forEach(processor -> processor.process("Hello world"));

        List<ChainItem<String>> chain = List.of(
                String::toLowerCase,
                s -> s.replaceAll("[^a-zA-Z ]", "")
        );

        System.out.println(process(chain.iterator(), "Hello world>!!*&"));




    }


}

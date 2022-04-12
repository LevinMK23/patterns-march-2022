package com.geekbrains.mapstructtest.service;

import org.springframework.stereotype.Component;

@Component
public class IdSupplier {

    private static int count = 1;

    public int getNext() {
        return count++;
    }

}

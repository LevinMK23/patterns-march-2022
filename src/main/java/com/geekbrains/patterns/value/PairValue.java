package com.geekbrains.patterns.value;

import lombok.Value;

@Value
public class PairValue<K, V> {
    K key;
    V value;
}

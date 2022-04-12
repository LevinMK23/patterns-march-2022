package com.geekbrains.patterns.currency;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Money {

    BigDecimal value;
    Currency currency;

}

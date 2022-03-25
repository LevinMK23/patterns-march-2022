package com.geekbrains.patterns.creators;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BuilderPojo {

    private final int f, g, h, i;
    private final String a, b, c, d, e;

}

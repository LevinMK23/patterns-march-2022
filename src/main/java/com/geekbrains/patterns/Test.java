package com.geekbrains.patterns;

import com.geekbrains.patterns.registry.ProductBuildStrategyRegistry;
import com.geekbrains.patterns.registry.VendorProduct;
import com.geekbrains.patterns.structure.proxy.BaseClass;
import com.geekbrains.patterns.structure.proxy.BaseClassWithLogMethodsProxy;
import com.geekbrains.patterns.value.Pair;
import com.geekbrains.patterns.value.PairValue;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashMap<PairValue<Integer, Integer>, Integer> map = new HashMap<>();

        map.put(new PairValue<>(1, 2), 1);
        map.put(new PairValue<>(1, 2), 2);

        System.out.println(map.size());

        double d = 1;

        d += 1 / 6.;
        d -= 2 / 12.;

        System.out.println(d);

        System.out.printf("%.20f\n%.20f\n", 3 / 5., 2 / 14.);

        double total = 0;
        total += 5.6; // 3 / 5
        total += 5.8; // 4 / 5
        System.out.println(total);

        ProductBuildStrategyRegistry registry = new ProductBuildStrategyRegistry();

        int product = registry.buildProduct(VendorProduct.MODEL_BIDS);
        System.out.println(product);

    }
}

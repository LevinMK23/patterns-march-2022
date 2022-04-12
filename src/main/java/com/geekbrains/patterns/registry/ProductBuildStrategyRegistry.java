package com.geekbrains.patterns.registry;

import java.util.Map;

public class ProductBuildStrategyRegistry {

    private final Map<VendorProduct, ProductBuildStrategy> registry;

    public ProductBuildStrategyRegistry() {
        registry = Map.of(
                VendorProduct.PAID_OPINIONS, new PaidOpinionProductBuildStrategy(),
                VendorProduct.MODEL_BIDS, new ModelBidsProductBuildStrategy()
        );
    }

    public int buildProduct(VendorProduct product) {
        return registry.get(product).build();
    }
}

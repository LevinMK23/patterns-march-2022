package com.geekbrains.patterns.registry;

public class ModelBidsProductBuildStrategy implements ProductBuildStrategy {

    // per day billing

    @Override
    public int build() {
        return 2;
    }
}

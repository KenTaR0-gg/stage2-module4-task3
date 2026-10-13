package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManufactureFilteringStrategy implements FilteringStrategy {
    private String manufacture;

    @Override

    public boolean filter (Product product) {
        if (product == null || product.getManufacture() == null) {
            return false;
        }
        return product.getManufacture().equalsIgnoreCase(this.manufacture);

    }
}



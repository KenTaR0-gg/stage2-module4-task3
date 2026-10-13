package com.mjc.stage2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    public double getPrice;
    public String getName;
    private String name;
    private double price;
    private String manufacture;
}

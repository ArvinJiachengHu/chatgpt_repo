package org.example.test_arvin.pattern.entities;

import org.example.test_arvin.pattern.interfaces.Product;

public class ConcreteProductA implements Product {
    @Override
    public String getName() {
        return "Product A";
    }
}

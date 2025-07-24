package org.example.test_arvin.pattern;

import org.example.test_arvin.pattern.entities.ConcreteProductA;
import org.example.test_arvin.pattern.interfaces.Product;
import org.example.test_arvin.pattern.interfaces.ProductFactory;

public class ConcreteProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}


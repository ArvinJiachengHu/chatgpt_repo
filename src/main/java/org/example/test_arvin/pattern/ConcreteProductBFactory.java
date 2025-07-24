package org.example.test_arvin.pattern;

import org.example.test_arvin.pattern.entities.ConcreteProductB;
import org.example.test_arvin.pattern.interfaces.Product;
import org.example.test_arvin.pattern.interfaces.ProductFactory;

public class ConcreteProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

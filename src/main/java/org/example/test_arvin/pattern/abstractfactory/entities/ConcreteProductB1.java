package org.example.test_arvin.pattern.abstractfactory.entities;

import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductB;

public class ConcreteProductB1 implements ProductB {
    @Override
    public String featureB() {
        return "Feature B1";
    }
}


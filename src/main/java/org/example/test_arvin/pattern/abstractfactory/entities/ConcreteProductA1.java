package org.example.test_arvin.pattern.abstractfactory.entities;

import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductA;

public class ConcreteProductA1 implements ProductA {
    @Override
    public String featureA() {
        return "Feature A1";
    }
}


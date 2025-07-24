package org.example.test_arvin.pattern.abstractfactory;

import org.example.test_arvin.pattern.abstractfactory.entities.ConcreteProductA2;
import org.example.test_arvin.pattern.abstractfactory.entities.ConcreteProductB2;
import org.example.test_arvin.pattern.abstractfactory.interfaces.AbstractFactory;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductA;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductB;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductC;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }

    @Override
    public ProductC createProductC() {
        return null;
    }
}


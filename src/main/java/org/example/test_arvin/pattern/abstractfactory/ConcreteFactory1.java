package org.example.test_arvin.pattern.abstractfactory;

import org.example.test_arvin.pattern.abstractfactory.entities.ConcreteProductA1;
import org.example.test_arvin.pattern.abstractfactory.entities.ConcreteProductB1;
import org.example.test_arvin.pattern.abstractfactory.interfaces.AbstractFactory;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductA;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductB;
import org.example.test_arvin.pattern.abstractfactory.interfaces.ProductC;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }

    @Override
    public ProductC createProductC() {
        return null;
    }
}


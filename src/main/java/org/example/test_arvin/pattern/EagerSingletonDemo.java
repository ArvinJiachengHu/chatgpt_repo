package org.example.test_arvin.pattern;

/**
 * 饿汉式单例模式（线程安全，类加载时即创建实例）
 */
public class EagerSingletonDemo {
    private static final EagerSingletonDemo instance = new EagerSingletonDemo();

    private EagerSingletonDemo() {}

    public static EagerSingletonDemo getInstance() {
        return instance;
    }

    public String sayHello() {
        return "Hello from Eager Singleton!";
    }
}


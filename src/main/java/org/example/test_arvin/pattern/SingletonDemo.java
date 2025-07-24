package org.example.test_arvin.pattern;

/**
 * 懒汉式单例模式（线程安全）
 */
public class SingletonDemo {
    private static volatile SingletonDemo instance;

    private SingletonDemo() {}

    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public String sayHello() {
        return "Hello from Singleton!";
    }
}


package org.shaotang.design.pattern.factory;

/**
 * 具体的创建器实现对象
 */
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {

        return new ConcreteProduct();
    }
}

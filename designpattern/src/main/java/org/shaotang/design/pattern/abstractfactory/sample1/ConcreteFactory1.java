package org.shaotang.design.pattern.abstractfactory.sample1;

/**
 * 一系列产品对象的创建
 */
public class ConcreteFactory1 implements AbstarctFactory{
    public AbstractProductA createProductA(){
        return new ProductA1();
    }
    public AbstractProductB createProductB(){
        return new ProductB1();
    }
}

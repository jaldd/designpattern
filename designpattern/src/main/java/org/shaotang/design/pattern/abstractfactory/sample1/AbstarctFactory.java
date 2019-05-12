package org.shaotang.design.pattern.abstractfactory.sample1;

/**
 * 定义一系列产品对象的接口
 */
public interface AbstarctFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}

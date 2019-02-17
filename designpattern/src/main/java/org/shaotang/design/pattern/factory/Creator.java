package org.shaotang.design.pattern.factory;

/**
 * 创建器，声明工厂方法
 * 包含两类方法
 */
public abstract class Creator {

    /**
     * @return Product对象
     */
    protected abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
    }
}


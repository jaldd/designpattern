package org.shaotang.design.pattern.singleton;

public class SingletonInner {

    private SingletonInner() {

    }

    public static class SingletonHolder {
        public static SingletonInner singleton = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonHolder.singleton;
    }
}

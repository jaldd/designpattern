package org.shaotang.design.pattern.singleton;

public class Singleton2Sync {

    private volatile static Singleton2Sync instance = null;

    private Singleton2Sync() {

    }

    public static Singleton2Sync getInstance() {
        if (instance == null) {
            synchronized (Singleton2Sync.class) {
                if (instance == null) {
                    instance = new Singleton2Sync();
                }
            }
        }
        return instance;
    }

}

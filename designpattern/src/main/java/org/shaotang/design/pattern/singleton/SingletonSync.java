package org.shaotang.design.pattern.singleton;

public class SingletonSync {

	private SingletonSync() {

	}

	private volatile static SingletonSync instance = null;

	public static SingletonSync getInstance() {
		if (instance == null) {
			synchronized (SingletonSync.class) {
				instance = new SingletonSync();
			}
		}
		return instance;
	}

}

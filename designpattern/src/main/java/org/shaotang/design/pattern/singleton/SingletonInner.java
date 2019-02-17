package org.shaotang.design.pattern.singleton;

public class SingletonInner {

	private SingletonInner() {

	}

	private static class SingletonHolder {
		private static SingletonInner instance = new SingletonInner();
	}

	public static SingletonInner getInstance() {
		return SingletonHolder.instance;
	}

}

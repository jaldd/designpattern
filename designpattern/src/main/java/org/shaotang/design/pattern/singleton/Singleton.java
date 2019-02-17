package org.shaotang.design.pattern.singleton;

public class Singleton {

	private Singleton() {

	}

//	private static Singleton uniqueInstance = new Singleton();
//
//	public static Singleton getInstance() {
//		return uniqueInstance;
//	}

	private static Singleton uniqueInstance = null;

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public void singletonOperation() {

	}

	private String singletonData;

	public String getSingletonData() {
		return singletonData;
	}
}

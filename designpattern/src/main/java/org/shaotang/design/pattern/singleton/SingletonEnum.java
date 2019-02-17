package org.shaotang.design.pattern.singleton;

public enum SingletonEnum {

	uniqueInstance;
	// public final static SingletonEnum uniqueInstanc=new uniqueInstance();
	public void get() {
		System.out.println(SingletonEnum.uniqueInstance.hashCode());
	}
}

package org.shaotang.design.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonCache {

	private SingletonCache() {

	}

	private static String DEFAULT_KEY = "one";
	private static Map<String, SingletonCache> map = new HashMap<>();

	public static SingletonCache getInstance() {
		SingletonCache instance = (SingletonCache) map.get(DEFAULT_KEY);
		if (instance == null) {
			instance = new SingletonCache();
			map.put(DEFAULT_KEY, instance);
		}
		return instance;
	}

}

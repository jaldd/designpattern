package org.shaotang.design.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonExtend {

	private final static String DEFAUTL_PREKEY = "Cache";
	private static Map<String, SingletonExtend> map = new HashMap<>();
	private static int num = 1;
	private final static int NUM_MAX = 3;

	private SingletonExtend() {

	}

	public static SingletonExtend getInstance() {
		String key = DEFAUTL_PREKEY + num;
		SingletonExtend singletonExtend = map.get(key);
		if (singletonExtend == null) {
			singletonExtend = new SingletonExtend();
			map.put(key, singletonExtend);
		}
		num++;
		if (num > NUM_MAX) {
			num = 1;
		}
		return singletonExtend;
	}

}

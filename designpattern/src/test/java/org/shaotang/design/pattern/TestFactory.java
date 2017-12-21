package org.shaotang.design.pattern;

import org.junit.Test;
import org.shaotang.design.pattern.simplefactory.DemoFactory;

public class TestFactory {


	@Test
	public void testFactory() {
		DemoFactory.createApi().test();
	}
}

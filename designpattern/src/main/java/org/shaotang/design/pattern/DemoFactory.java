package org.shaotang.design.pattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoFactory {

	private DemoFactory() {

	}

	public static Api createApi() {
		Properties p = new Properties();
		InputStream in = null;
		Api api = null;
		try {
			in = DemoFactory.class.getResourceAsStream("factory.properties");
			p.load(in);
			System.out.println(p.getProperty("impl"));
			api = (Api) Class.forName(p.getProperty("impl")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return api;
	}

}

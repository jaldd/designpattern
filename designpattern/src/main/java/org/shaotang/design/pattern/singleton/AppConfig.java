package org.shaotang.design.pattern.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private static AppConfig instance = new AppConfig();

	public static AppConfig getInstace() {
		return instance;
	}

	private String parameterA;

	private String parameterB;

	public String getParameterA() {
		return parameterA;
	}

	public String getParameterB() {
		return parameterB;
	}

	private AppConfig() {
		readConfig();
	}

	private void readConfig() {
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = AppConfig.class.getResourceAsStream("single.properties");
			p.load(in);
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

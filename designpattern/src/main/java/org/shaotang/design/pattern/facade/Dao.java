package org.shaotang.design.pattern.facade;

public class Dao {

	public void generate() {
		ConfigModel cm=ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenDao()) {
			System.out.println("dao code file");
		}
	}
}

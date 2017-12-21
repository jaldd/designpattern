package org.shaotang.design.pattern.facade;

public class Business {

	public void generate() {
		ConfigModel cm=ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenBusiness()) {
			System.out.println("business code file");
		}
	}
}

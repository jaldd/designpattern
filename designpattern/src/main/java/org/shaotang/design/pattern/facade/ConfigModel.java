package org.shaotang.design.pattern.facade;

public class ConfigModel {

	private boolean needGenPresentation = true;
	private boolean needGenBusiness = true;
	private boolean needGenDao = true;

	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}

	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public boolean isNeedGenDao() {
		return needGenDao;
	}

	public void setNeedGenDao(boolean needGenDao) {
		this.needGenDao = needGenDao;
	}

	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}

}

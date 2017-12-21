package org.shaotang.design.pattern.facade;

public class FacadeFactory {

	private FacadeFactory() {

	}

	public static FacadeApi createFacadeApi() {
		return new Facade();
	}

}

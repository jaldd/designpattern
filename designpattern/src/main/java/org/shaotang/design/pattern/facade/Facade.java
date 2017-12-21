package org.shaotang.design.pattern.facade;

public class Facade implements FacadeApi{

	public void generate() {
		new Business().generate();
		new Presentation().generate();
		new Dao().generate();
	}
}

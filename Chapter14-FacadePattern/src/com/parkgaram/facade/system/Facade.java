package com.parkgaram.facade.system;

public class Facade {

	private HelpSystem1 helpSystem01;
	private HelpSystem2 helpSystem02;
	private HelpSystem3 helpSystem03;
	
	public Facade() {
		helpSystem01 = new HelpSystem1();
		helpSystem02 = new HelpSystem2();
		helpSystem03 = new HelpSystem3();
	}
	
	public void process(){
		helpSystem01.process();
		helpSystem02.process();
		helpSystem03.process();
	}
	
}

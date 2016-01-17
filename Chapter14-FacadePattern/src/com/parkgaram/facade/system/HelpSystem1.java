package com.parkgaram.facade.system;

class HelpSystem1 {

	public HelpSystem1() {
		System.out.println("Call Constructor : " + getClass().getSimpleName());
	}
	
	public void process(){
		System.out.println("Call Process : "+ getClass().getSimpleName());
	}
}


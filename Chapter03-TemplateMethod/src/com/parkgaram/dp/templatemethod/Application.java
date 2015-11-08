package com.parkgaram.dp.templatemethod;

public class Application {

	public static void main(String[] args) {
		AbstConnectHelper abstConnectHelper = new ConcreteConnectHelper();
		
		abstConnectHelper.requestConnection("info");
	}

}

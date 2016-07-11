package com.parkgaram.mediator;

import com.parkgaram.mediator.contract.Colleague;
import com.parkgaram.mediator.contract.Mediator;

public class Application {

	public static void main(String[] args) {
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2= new ChatColleague();
		Colleague colleague3= new ChatColleague();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
		
	}
}

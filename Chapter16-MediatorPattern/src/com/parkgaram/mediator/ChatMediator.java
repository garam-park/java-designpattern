package com.parkgaram.mediator;

import com.parkgaram.mediator.contract.Colleague;
import com.parkgaram.mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for (Colleague colleague : colleagues) {
			//중재가능성.
			colleague.handle(data);
		}
	}

}

package Sam;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel creatWheel() {
		return new SamWheel();
	}

}

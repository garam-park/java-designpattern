package gt;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class GtBikeFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel creatWheel() {
		return new GtWheel();
	}

}

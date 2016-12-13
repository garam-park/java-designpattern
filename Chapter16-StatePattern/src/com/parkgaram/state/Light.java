package com.parkgaram.state;

public class Light {
	
	protected LightState lightState;
	
	private LightState offState = new LightState() {
		
		@Override
		public void on() {
			System.out.println("Light ON");
			lightState = onState;
		}
		
		@Override
		public void off() {
			System.out.println("Nothing");
		}
	};
	
	private LightState onState = new LightState() {
		
		@Override
		public void on() {
			System.out.println("Nothing");
		}
		
		@Override
		public void off() {
			System.out.println("Light OFF");
			lightState = offState;
		}
	};
	
	public Light() {
		lightState = offState ;
	}
	
	public void on() {
		lightState.on();
	}
	
	public void off() {
		lightState.off();
	}
	
}

interface LightState {
	
	void on();
	void off();
	
}

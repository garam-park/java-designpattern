package com.parkgaram.dp.singleton;

public class SomeSystemComponent {

	private static SomeSystemComponent instance;
	
	private SomeSystemComponent() {
		
	}
	
	public static SomeSystemComponent getInstance(){
		if (instance == null) {
			
		}else {
			instance = new SomeSystemComponent();
		}
		return instance;
	}
}

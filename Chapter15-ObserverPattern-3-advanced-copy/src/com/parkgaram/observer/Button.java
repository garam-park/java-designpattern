package com.parkgaram.observer;

import java.util.Observable;

/**
 * Target
 * @author garam
 *
 */
public class Button extends Observable{

	public void onClick(){
		setChanged();
		notifyObservers();
	}
}

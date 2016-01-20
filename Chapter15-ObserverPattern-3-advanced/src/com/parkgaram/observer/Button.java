package com.parkgaram.observer;

import com.parkgaram.observer.Observable.Observer;

public class Button {

	public Button() {
		observable = new Observable<String>();
	}
	
	private Observable<String> observable;
	
	public void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}
	
	public void notifyObservers() {
		observable.notifyObservers(null);
    }

	public void onClick() {
		observable.setChanged();
		notifyObservers();
	}
	
}

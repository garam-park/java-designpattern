package com.parkgaram.memento.abc;

public class Originator {
	
	String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void restoreMement(Memento memento) {
		this.state = memento.getState();
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}

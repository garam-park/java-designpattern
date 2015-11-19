package com.parkgaram.dp.visitor.contract;

public interface Visitable {
	public void accept(Visitor visitor);
}
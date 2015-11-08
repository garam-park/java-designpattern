package com.parkgaram.dp.prototype;

class A implements Cloneable {
	public int x, y;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
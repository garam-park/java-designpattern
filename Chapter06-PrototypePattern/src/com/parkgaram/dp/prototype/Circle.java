package com.parkgaram.dp.prototype;

public class Circle extends Shape {

	int x, y;
	int r;
	public Double d;
	public A a;
	
	public Circle() {
		a = new A();
	}
	
	public void setA(A a) {
		this.a = a;
	}
	
	public A getA() {
		return a;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Shape copy() throws CloneNotSupportedException {
		
		Circle shape = (Circle) clone();
		
		shape.x += 1;
		shape.y += 1;
		shape.setA((A)shape.getA().clone());
		
		return shape;
	}
}



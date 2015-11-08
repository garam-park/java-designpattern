package com.parkgaram.dp.prototype;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle1 = new Circle();

		circle1.setId("1");

		circle1.setX(1);
		circle1.setY(1);
		circle1.setR(3);

		circle1.a.x = 1;

		Circle circle2 = (Circle) circle1.copy();

		System.out.println(circle1.a.x);
		System.out.println(circle2.a.x);

		circle1.a.x = 2;

		System.out.println(circle1.a.x);
		System.out.println(circle2.a.x);

		circle2.a.x = 3;

		System.out.println(circle1.a.x);
		System.out.println(circle2.a.x);

	}

}

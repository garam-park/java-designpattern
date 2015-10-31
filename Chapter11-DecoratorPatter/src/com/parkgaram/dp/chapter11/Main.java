package com.parkgaram.dp.chapter11;

import java.util.Scanner;

import com.parkgaram.dp.chapter11.abst.IBeverage;
import com.parkgaram.dp.chapter11.concrete.Base;
import com.parkgaram.dp.chapter11.concrete.Espresso;
import com.parkgaram.dp.chapter11.concrete.Milk;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// base
		IBeverage beverage = new Base();
		boolean done = false;
		while (!done) {
			System.out.println("음료 현재 가격 : "+beverage.getTotalPrice());
			System.out.print("선택 : 1:샷 추가 / 2:우유 추가");
			switch (sc.nextInt()) {
			case 0: done = true;
				break;
			case 1: 
				beverage = new Espresso(beverage);
				break;
			case 2:
				beverage = new Milk(beverage);
				break;
			}
		}

		System.out.println("음료 가격 : "+beverage.getTotalPrice());
		sc.close();
	}

}

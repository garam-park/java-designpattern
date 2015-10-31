package com.parkgaram.dp.chapter11.concrete;

import com.parkgaram.dp.chapter11.abst.IBeverage;
/**
 * <h2><b>Role : </b>ConcreteComponent</h2>
 *  <p>
 *  Component의 실질적인 인스턴스의 부분이며, 책임의 주체입니다.
 *  </p>
 * @author garam park
 *
 */
public class Base implements IBeverage {

	@Override
	public int getTotalPrice() {
		return 0;
	}

}

package com.parkgaram.dp.chapter11.concrete;

import com.parkgaram.dp.chapter11.abst.AbstAdding;
import com.parkgaram.dp.chapter11.abst.IBeverage;

/**
 * <h2><b>Role : </b>ConcreteDecorator</h2>
 *  <p>
 *  실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.
 *  </p>
 * @author garam park
 *
 */
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
	
}

package com.parkgaram.dp.chapter11.abst;

/**
 *  <h2><b>Role : </b>Decorator</h2>
 *  <p>
 *  컴포넌트와 장식을 동일시 해주는 역할합니다.
 *  </p>
 * @author garam park
 */
abstract public class AbstAdding implements IBeverage {
	
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase() {
		return base;
	}
}

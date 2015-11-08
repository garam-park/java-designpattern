package com.parkgaram.dp.templatecreator;

import com.parkgaram.dp.templatecreator.fw.Item;

public class DefaultItem extends Item {

	private String itemName;
	
	public DefaultItem(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public void use() {
		System.out.println(itemName +" 사용했습니다!");
	}
	

}

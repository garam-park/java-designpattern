package com.parkgaram.dp.templatecreator.fw;

public abstract class Creator {

	public Item create(String itemName){
		
		init(itemName);
		Item item = createItem(itemName);
		end(itemName);
		
		return item;
	}
	
	abstract protected String end(String itemName);
	abstract protected String init(String itemName);
	abstract protected Item createItem(String itemName);
	
}

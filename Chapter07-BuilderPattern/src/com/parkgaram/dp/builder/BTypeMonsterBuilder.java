package com.parkgaram.dp.builder;

public class BTypeMonsterBuilder extends Builder{

	public BTypeMonsterBuilder() {
		monster = new Monster();
	}

	@Override
	public void setHp() {
		monster.setHp(200);
	}

	@Override
	public void setAt() {
		monster.setAt(200);
	}

	@Override
	public void setDf() {
		monster.setDf(200);
	}

	@Override
	public void setName() {
		monster.setName("해골영웅");
	}
	
}

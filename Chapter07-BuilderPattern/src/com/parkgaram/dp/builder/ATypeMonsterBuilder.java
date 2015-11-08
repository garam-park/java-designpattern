package com.parkgaram.dp.builder;

public class ATypeMonsterBuilder extends Builder{

	public ATypeMonsterBuilder() {
		monster = new Monster();
	}

	@Override
	public void setHp() {
		monster.setHp(100);
	}

	@Override
	public void setAt() {
		monster.setAt(100);
	}

	@Override
	public void setDf() {
		monster.setDf(100);
	}

	@Override
	public void setName() {
		monster.setName("해골병사");
	}

}

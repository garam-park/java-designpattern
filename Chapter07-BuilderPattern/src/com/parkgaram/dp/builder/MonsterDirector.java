package com.parkgaram.dp.builder;

public class MonsterDirector {

	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Monster gen() {
		return builder.build();
	}

}

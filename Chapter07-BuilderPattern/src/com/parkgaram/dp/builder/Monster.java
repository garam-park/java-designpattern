package com.parkgaram.dp.builder;

public class Monster {

	private int hp,at,df;
	private String name;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAt() {
		return at;
	}
	public void setAt(int at) {
		this.at = at;
	}
	public int getDf() {
		return df;
	}
	public void setDf(int df) {
		this.df = df;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " name : "+name+"\n"+
				" hp : "+hp+"\n"+
				" at : "+at+"\n"+
				" df : "+df;
		
	}
	
}

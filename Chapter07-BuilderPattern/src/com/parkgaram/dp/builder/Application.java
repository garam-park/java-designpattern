package com.parkgaram.dp.builder;

public class Application {

	public static void main(String[] args) {
		MonsterDirector director = new MonsterDirector();
		
		Builder builder = new ATypeMonsterBuilder();

		director.setBuilder(builder);
		
		System.out.println(director.gen());

		builder = new BTypeMonsterBuilder();
		director.setBuilder(builder);
		Monster monster = director.gen();
		
		System.out.println(monster);
	}
}

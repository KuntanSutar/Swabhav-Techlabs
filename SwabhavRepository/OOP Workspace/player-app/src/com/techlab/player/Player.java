package com.techlab.player;

public class Player {

	private String name;
	private int age;
	private GenderOptions gender;

	public Player(String name, int age, GenderOptions gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Player(String name) {
//		name=name;
//		age=18;
//		gender=GenderOptions.MALE;
		this(name, 18, GenderOptions.MALE);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderOptions getGenderOption() {
		return gender;
	}

	public Player whoIsElder(Player player) {
		if (this.age > player.age) {
			return this;
		}
		return player;
	}

}

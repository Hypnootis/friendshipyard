package com.hypnootis.friendshipyard;

public class Chicken extends Bird {

	boolean laysEggs;
	
	Chicken(String name, Animal bestFriend, String favoriteFood, boolean laysEggs, double wingspan) {
		super(name, bestFriend, favoriteFood, wingspan);
		this.type = "chicken";
		this.laysEggs = laysEggs;
	}

}

package com.hypnootis.friendshipyard;

public class Chicken extends Bird {

	boolean laysEggs;
	
	Chicken(String name, String favoriteFood, boolean laysEggs, double wingspan, String bestFriend) {
		super(name, bestFriend, wingspan, bestFriend);
		this.type = "chicken";
		this.laysEggs = laysEggs;
	}

}

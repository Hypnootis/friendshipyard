package com.hypnootis.friendshipyard;

public class Chicken extends Bird {

	boolean laysEggs;
	
	Chicken(String name, String favoriteFood, boolean laysEggs, double wingspan) {
		super(name, favoriteFood, wingspan);
		this.type = "chicken";
		this.laysEggs = laysEggs;
	}

}

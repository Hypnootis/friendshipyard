package com.hypnootis.friendshipyard;

public class Chicken extends Bird {

	boolean laysEggs;
	
	Chicken(String name, String favoriteFood, boolean laysEggs, double wingspan) {
		super(name, favoriteFood, wingspan);
		this.type = "chicken";
		this.laysEggs = laysEggs;
	}
	
	void printAttributes() {
		System.out.println("Name: " + this.name + ". Favorite food: " + this.favoriteFood + ". Lays eggs: " 
	 + Boolean.toString(laysEggs) + ". Wingspan: " + Double.toString(wingspan) + "m. Best friend: " + this.bestFriend.name);
	}

}

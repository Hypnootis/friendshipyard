package com.hypnootis.friendshipyard;

public class Bird extends Animal {

	double wingspan;
	
	Bird(String name, Animal bestFriend, String favoriteFood, double wingspan) {
		super(name, bestFriend, favoriteFood);
		this.wingspan = wingspan;
		this.type = "bird";
	}

}

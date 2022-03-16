package com.hypnootis.friendshipyard;

public class Bird extends Animal {

	double wingspan;
	
	Bird(String name, String favoriteFood, double wingspan, String bestFriend) {
		super(name, bestFriend, favoriteFood);
		this.wingspan = wingspan;
		this.type = "bird";
	}

}

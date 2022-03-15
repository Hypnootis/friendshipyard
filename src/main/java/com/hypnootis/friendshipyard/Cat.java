package com.hypnootis.friendshipyard;

public class Cat extends Animal{
	
	// Bare-bones class, but additional functionality could be added
	
	Cat(String name, Animal bestFriend, String favoriteFood) {
		super(name, bestFriend, favoriteFood);
		this.type = "cat";
	}

}

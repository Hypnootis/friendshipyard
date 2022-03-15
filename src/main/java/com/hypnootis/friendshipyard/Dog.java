package com.hypnootis.friendshipyard;

public class Dog extends Animal {

	String breed;
	
	Dog(String name, Animal bestFriend, String favoriteFood, String breed){
		super(name, bestFriend, favoriteFood);
		this.breed = breed;
		this.type = "dog";
	}
}

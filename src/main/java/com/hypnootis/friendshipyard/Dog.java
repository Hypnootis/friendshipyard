package com.hypnootis.friendshipyard;

public class Dog extends Animal {

	String breed;
	
	Dog(String name, String breed, String favoriteFood, String bestFriend){
		super(name, bestFriend, favoriteFood);
		this.breed = breed;
		this.type = "dog";
	}
}

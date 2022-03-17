package com.hypnootis.friendshipyard;

public class Dog extends Animal {

	String breed;
	
	Dog(String name, String breed, String favoriteFood){
		super(name, favoriteFood);
		this.breed = breed;
		this.type = "dog";
	}
	
	void printAttributes() {
		System.out.println("Name: " + this.name + ". Breed: " + this.breed + ". Favorite food: " + this.favoriteFood
				+ ". Best friend: " + this.bestFriend.name);
	}
}

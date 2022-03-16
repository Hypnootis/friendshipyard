package com.hypnootis.friendshipyard;

public class Bird extends Animal {

	double wingspan;
	
	Bird(String name, String favoriteFood, double wingspan) {
		super(name, favoriteFood);
		this.wingspan = wingspan;
		this.type = "bird";
	}
	
	void printAttributes() {
		System.out.println("Name: " + this.name + ". Favorite food: " + this.favoriteFood + ". Wingspan: " + Double.toString(wingspan) + "m.");
	}

}

package com.hypnootis.friendshipyard.animals;

public class Bird extends Animal {

	private double wingspan;
	
	Bird(String name, String favoriteFood, double wingspan) {
		super(name, favoriteFood);
		this.wingspan = wingspan;	
	}
	
	public double getWingspan() {
		return this.wingspan;
	}

}

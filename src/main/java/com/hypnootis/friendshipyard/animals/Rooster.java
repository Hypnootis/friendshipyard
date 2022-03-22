package com.hypnootis.friendshipyard.animals;

public class Rooster extends Bird{

	public Rooster(String name, String favoriteFood, double wingspan) {
		super(name, favoriteFood, wingspan);
		
		this.setBestFriend(this);
	}

}

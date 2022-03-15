package com.hypnootis.friendshipyard;

public class Parrot extends Bird{
	
	boolean canSpeak;
		
	Parrot(String name, Animal bestFriend, String favoriteFood, double wingspan, boolean canSpeak) {
		super(name, bestFriend, favoriteFood, wingspan);
		this.canSpeak = canSpeak;
	}

}

package com.hypnootis.friendshipyard;

public class Parrot extends Bird{
	
	boolean canSpeak;
		
	Parrot(String name, String favoriteFood, double wingspan, boolean canSpeak, String bestFriend) {
		super(name, favoriteFood, wingspan, bestFriend);
		this.canSpeak = canSpeak;
	}

}

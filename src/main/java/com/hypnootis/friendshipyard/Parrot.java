package com.hypnootis.friendshipyard;

public class Parrot extends Bird{
	
	boolean canSpeak;
		
	Parrot(String name, String favoriteFood, double wingspan, boolean canSpeak) {
		super(name, favoriteFood, wingspan);
		this.canSpeak = canSpeak;
	}

}

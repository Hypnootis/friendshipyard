package com.hypnootis.friendshipyard.animals;

public class Parrot extends Bird{
	
	private boolean canSpeak;
		
	public Parrot(String name, String favoriteFood, double wingspan, boolean canSpeak) {
		super(name, favoriteFood, wingspan);
		this.canSpeak = canSpeak;
	}
	
	public void printAttributes() {
		super.printAttributes("Can speak: " + String.valueOf(canSpeak) + ".");
	}
	
	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}
	
	public boolean getCanSpeak() {
		return this.canSpeak;
	}

}

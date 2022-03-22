package com.hypnootis.friendshipyard.animals;

public class Chicken extends Bird {

	private boolean laysEggs;
	
	public Chicken(String name, String favoriteFood, boolean laysEggs, double wingspan) {
		super(name, favoriteFood, wingspan);
		this.laysEggs = laysEggs;
	}
	
	@Override
	public void printAttributes() {
		super.printAttributes("Lays eggs: " + String.valueOf(laysEggs) + ".");
	}
	
	public void setLaysEggs(boolean doesLay) {
		this.laysEggs = doesLay;
	}
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}

}

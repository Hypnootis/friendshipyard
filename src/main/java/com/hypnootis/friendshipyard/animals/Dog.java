package com.hypnootis.friendshipyard.animals;

public class Dog extends Animal {

	private Breed breed;
	
	public Dog(String name, Breed breed, String favoriteFood){
		super(name, favoriteFood);
		this.breed = breed;
	}
	
	@Override
	public void printAttributes() {
		super.printAttributes("Breed: " + this.breed.toString() + ".");
	}
	
	public enum Breed{
		SHEPHERD,
		HUSKY
	}
	
	public void setBreed(Breed newBreed) {
		this.breed = newBreed;
	}
	
	public Breed getBreed() {
		return this.breed;
	}
}

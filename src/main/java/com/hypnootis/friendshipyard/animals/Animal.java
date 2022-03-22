package com.hypnootis.friendshipyard.animals;
import java.util.ArrayList;

public class Animal {
		private String name;
		private Animal bestFriend;
		private ArrayList<Animal> friends = new ArrayList<Animal>();
		private String favoriteFood;
	
	public Animal(String name, String favoriteFood){
		this.name = name;
		this.favoriteFood = favoriteFood;
	}
		
	public void addFriend(Animal friend, boolean printEvent) {
		if (!this.friends.contains(friend)) {
			this.friends.add(friend);
			if (printEvent) {
			System.out.println(this.getName() + " is now friends with " + friend.getName() + "!");
			}
		}
	}
	
	public void removeFriend(Animal friend, boolean printEvent) {
		if (this.friends.contains(friend)) {
			this.friends.remove(friend);
			if (printEvent) {
				System.out.println(this.getName() + " is no longer friends with " + friend.getName());
			}
		}
	}
	
	public Animal getBestFriend() {
		return this.bestFriend;
	}
	
	public void setBestFriend(Animal newBestFriend) {
		this.bestFriend = newBestFriend;
	}
	
	public void printAttributes() {
		System.out.println("Name: " + this.getName() + ". Favorite food: " + this.getFavoriteFood() + ". Best friend:  " + this.getBestFriend().name);
	}
	
	public void printAttributes(String additionalAttributes) {
		System.out.println("Name: " + this.getName() + ". Favorite food: " + this.getFavoriteFood()
		+ ". Best friend:  " + this.getBestFriend().name + ". " + additionalAttributes);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setFavoriteFood(String food) {
		this.favoriteFood = food;
	}
	
	public String getFavoriteFood() {
		return this.favoriteFood;
	}
	
	public ArrayList<Animal> getFriends(){
		return this.friends;
	}
	
	
	
}

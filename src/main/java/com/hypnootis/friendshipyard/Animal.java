package com.hypnootis.friendshipyard;
import java.util.ArrayList;

public class Animal {
		String name;
		String type;
		Animal bestFriend;
		ArrayList<Animal> friends = new ArrayList<Animal>();
		String favoriteFood;
	
	Animal(String name, String favoriteFood){
		this.name = name;
		this.favoriteFood = favoriteFood;
	}
		
	void addFriend(Animal friend) {
		if (!this.friends.contains(friend)) {
			this.friends.add(friend);
		}
		else {
			System.out.println(friend.name + " is already a friend of " + this.name);
		}
	}
	
	void removeFriend(Animal friend) {
		if (this.friends.contains(friend)) {
			this.friends.remove(friend);
		}
		else {
			System.out.println(friend.name + " is not a friend of " + this.name);
		}
	}
	
	void setBestFriend(Animal newBestFriend) {
		this.bestFriend = newBestFriend;
	}
	
	void printAttributes() {
		System.out.println("Name: " + this.name + ". Favorite food: " + this.favoriteFood + ". Best friend:  " + this.bestFriend.name);
	}
	
}

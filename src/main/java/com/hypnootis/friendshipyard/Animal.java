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
		
	void addFriend(Animal friend, boolean printEvent) {
		if (!this.friends.contains(friend)) {
			this.friends.add(friend);
			if (printEvent) {
			System.out.println(this.name + " is now friends with " + friend.name + "!");
			}
		}
	}
	
	void removeFriend(Animal friend, boolean printEvent) {
		if (this.friends.contains(friend)) {
			this.friends.remove(friend);
			if (printEvent) {
				System.out.println(this.name + " is no longer friends with " + friend.name);
			}
		}
	}
	
	void setBestFriend(Animal newBestFriend) {
		this.bestFriend = newBestFriend;
	}
	
	void printAttributes() {
		System.out.println("Name: " + this.name + ". Favorite food: " + this.favoriteFood + ". Best friend:  " + this.bestFriend.name);
	}
	
}

package com.hypnootis.friendshipyard;
import java.util.ArrayList;

public class Animal {
		String name;
		String type;
		Animal bestFriend;
		ArrayList<Animal> friends;
		String favoriteFood;
	
	Animal(String name, Animal bestFriend, String favoriteFood){
		this.name = name;
		this.bestFriend = bestFriend;
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
}

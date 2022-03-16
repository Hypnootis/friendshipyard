package com.hypnootis.friendshipyard;
import java.util.ArrayList;

public class Animal <T extends Animal<?>>{
		String name;
		String type;
		String bestFriend;
		ArrayList<T> friends;
		String favoriteFood;
	
	Animal(String name, String bestFriend, String favoriteFood){
		this.name = name;
		this.bestFriend = bestFriend;
		this.favoriteFood = favoriteFood;
	}
		
	void addFriend(T friend) {
		if (!this.friends.contains(friend)) {
			this.friends.add(friend);
		}
		else {
			System.out.println(friend.name + " is already a friend of " + this.name);
		}
	}
	
	void removeFriend(T friend) {
		if (this.friends.contains(friend)) {
			this.friends.remove(friend);
		}
		else {
			System.out.println(friend.name + " is not a friend of " + this.name);
		}
	}
}

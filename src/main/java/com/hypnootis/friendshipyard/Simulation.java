package com.hypnootis.friendshipyard;

import java.util.ArrayList;
import java.util.Random;

public class Simulation {

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	private int dayCounter = 0;
	private Random rand = new Random();
	
	public Simulation(ArrayList<Animal> animals) {
		this.animals = animals;
		
	}
	
	void friendEvent(Animal animal) {
		Animal newFriend = animals.get(rand.nextInt(animals.size()));
		
		if (newFriend != animal.bestFriend && newFriend != animal && !animal.friends.contains(newFriend)) {
			System.out.println(animal.name + " asks " + newFriend.name + " to be friends.");
			
			if (animal.friends.size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.addFriend(newFriend);
					System.out.println(animal.name + " is now friends with " + newFriend.name + "!");
				}
				else {
					System.out.println(newFriend.name + " doesn't want to be friends with " + animal.name + ".");
				}
			}
		}
		
		else {
			friendEvent(animal); // Recursion to find the animal again
		}
	}
	
	void unfriendEvent(Animal animal) {
		Animal friend = animal.friends.get(rand.nextInt(animal.friends.size()));
		
		if (friend != animal.bestFriend && friend != animal) {
			
			if (animal.friends.size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.removeFriend(friend);
					friend.removeFriend(animal);
					System.out.println(animal.name + " is no longer friends with " + friend.name + ".");
				}
			}
		}
	}
	
	void morning() {
		System.out.println("Day " + Integer.toString(dayCounter));
		System.out.println("The morning sun has vanquished the horrible night on the village yard.\n");
		for (Animal animal : this.animals) {
			animal.printAttributes();
			
		}
		
		for (Animal animal : this.animals) {
			unfriendEvent(animal);
		}
	}
	
	void lunch() {
		
	}
	
	void simulateDay() {
		morning();
		lunch();
		evening();
	}
	
}

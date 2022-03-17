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
	
	void friendEvent(Animal animal, boolean printEvent) {
		Animal newFriend = animals.get(rand.nextInt(animals.size()));
		
		if (newFriend != animal.bestFriend && newFriend != animal && !animal.friends.contains(newFriend)) {
			System.out.println(animal.name + " asks " + newFriend.name + " to be friends.");
			
			if (animal.friends.size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.addFriend(newFriend, printEvent);
				}
				else {
					System.out.println(newFriend.name + " doesn't want to be friends with " + animal.name + ".");
				}
			}
			else if (animal.friends.size() < 3) {
				
				if (rand.nextInt(100) > 90) {
					animal.addFriend(newFriend, printEvent);
				}
			}
		}
		
		else {
			friendEvent(animal, printEvent); // Recursion to find the animal again
		}
	}
	
	void unfriendEvent(Animal animal, boolean printEvent) {
		
		Animal friend = animal.friends.get(rand.nextInt(animal.friends.size()));
		
		if (friend != animal.bestFriend && friend != animal) {
			
			if (animal.friends.size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.removeFriend(friend, printEvent);
					friend.removeFriend(animal, printEvent);
					
					if (printEvent) {
					System.out.println(animal.name + " is no longer friends with " + friend.name + ".");
					}
				}
			}
		}
	}
	
	void morning(boolean printEvents) {
		System.out.println("\nDay " + Integer.toString(dayCounter));
		System.out.println("The morning sun has vanquished the horrible night on the village yard.\n");
		for (Animal animal : this.animals) {
			animal.printAttributes();
			
		}
		
		for (Animal animal : this.animals) {
			if (animal.friends.size() != 0) {
			unfriendEvent(animal, printEvents);
			}
		}
	}
	
	void lunch(boolean printEvents) {
		
		if (printEvents) {
		System.out.println("Lunch, baby!");
		//for (Animal animal : this.animals) {
		//}
		}
	}
	
	void evening(boolean printEvents) {
		for (Animal animal : this.animals) {
			friendEvent(animal, printEvents);
		}
	}
	
	void simulateDay(boolean printEvents) {
		morning(printEvents);
		lunch(printEvents);
		evening(printEvents);
		printChart(printEvents);
		dayCounter++;
	}
	
	void simulateMany(int days, boolean printEvents) {
		for (int i = 0; i < days; i++) {
			simulateDay(printEvents);
		}
		simulateDay(true);
	}
	
	void printChart(boolean printEvents) {
		int rows = this.animals.size();
		int columns = this.animals.size();
		int[][] chart = new int[rows][columns];
		
		for (int[] row : chart) {
			System.out.println("hello");
		}
	}
	
}

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
	
	void clearAnimals() {
		this.animals.clear();
	}
	
	void friendEvent(Animal animal, boolean printEvent) {
		Animal newFriend = animals.get(rand.nextInt(animals.size()));
		
		if (newFriend != animal.bestFriend && newFriend != animal && !animal.friends.contains(newFriend)) {
			if (printEvent) {
			System.out.println(animal.name + " asks " + newFriend.name + " to be friends.");
			}
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
		System.out.println();
	}
	
	void lunch(boolean printEvents) {
		
		ArrayList<String> favoriteFoods = new ArrayList<String>();
		
		for (Animal animal : animals) {
			if (!favoriteFoods.contains(animal.favoriteFood)) {
				favoriteFoods.add(animal.favoriteFood);
			}
		}
		
		if (printEvents) {
			
			for (String food : favoriteFoods) {
				String eaters = "";
				int i = 0; // For keeping track if a food only has a single favourer
				for (Animal animal : animals) {
					if (animal.favoriteFood == food) {
						if (eaters.length() != 0) {
							eaters += " and ";
						}
						eaters += animal.name;
						i++;
					}
				}
				if (i == 1) {
					System.out.println(eaters + " is eating " + food);
				}
				else {
				System.out.println(eaters + " are eating " + food);
				}
			}
			System.out.println();
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
		for (int i = 0; i <= days; i++) {
			simulateDay(printEvents);
		}
	}
	
	void printChart(boolean printEvents) {
		
		String longestName = "";
		
		for (Animal animal : animals) {
			if (animal.name.length() > longestName.length()) {
				longestName = animal.name;
			}
		}
		
		int rowLength = animals.size() + longestName.length();
		String header = " ".repeat(longestName.length());
		
		for (Animal animal : animals) {
			header += "|" + animal.name;
			rowLength += animal.name.length(); 
		}
		System.out.println("\n" + header);

		
		for (int i = 0; i < animals.size(); i++) {
			String isFriend = "";
			Animal animal = animals.get(i);
			String row = " ".repeat(longestName.length() - animal.name.length()) + animal.name;
			
			for (Animal friend : animals) {
				if (friend != animal) {
					isFriend = animal.friends.contains(friend) ? "y" : "n";
				}
				else {
					isFriend = "X";
				}
				String emptySpace = " ".repeat(friend.name.length() -1);
				row += ("|" + isFriend + emptySpace);
				
			}
			System.out.println(row);
			}
		}
	}
	

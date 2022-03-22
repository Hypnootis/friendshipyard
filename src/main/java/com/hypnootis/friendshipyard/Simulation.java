package com.hypnootis.friendshipyard;

import java.util.ArrayList;
import java.util.Random;

import com.hypnootis.friendshipyard.animals.Animal;

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
		
		if (!newFriend.equals(animal.getBestFriend()) && !newFriend.equals(animal) && !animal.getFriends().contains(newFriend)) {
			if (printEvent) {
			System.out.println(animal.getName() + " asks " + newFriend.getName() + " to be friends.");
			}
			if (animal.getFriends().size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.addFriend(newFriend, printEvent);
				}
				else {
					System.out.println(newFriend.getName() + " doesn't want to be friends with " + animal.getName() + ".");
				}
			}
			else if (animal.getFriends().size() < 3) {
				
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
		
		Animal friend = animal.getFriends().get(rand.nextInt(animal.getFriends().size()));
		
		if (!friend.equals(friend.getBestFriend()) && !friend.equals(animal)) {
			
			if (animal.getFriends().size() >= 3) {
				
				if (rand.nextInt(100) < 90) {
					animal.removeFriend(friend, printEvent);
					friend.removeFriend(animal, printEvent);
					
					if (printEvent) {
					System.out.println(animal.getName() + " is no longer friends with " + friend.getName() + ".");
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
			if (animal.getFriends().size() != 0) {
			unfriendEvent(animal, printEvents);
			}
		}
		System.out.println();
	}
	
	void lunch(boolean printEvents) {
		
		ArrayList<String> favoriteFoods = new ArrayList<String>();
		
		for (Animal animal : animals) {
			if (!favoriteFoods.contains(animal.getFavoriteFood())) {
				favoriteFoods.add(animal.getFavoriteFood());
			}
		}
		
		if (printEvents) {
			
			for (String food : favoriteFoods) {
				String eaters = "";
				int i = 0; // For keeping track if a food only has a single favorer
				for (Animal animal : animals) {
					if (animal.getFavoriteFood() == food) {
						if (eaters.length() != 0) {
							eaters += " and ";
						}
						eaters += animal.getName();
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
			if (animal.getName().length() > longestName.length()) {
				longestName = animal.getName();
			}
		}
		
		int rowLength = animals.size() + longestName.length();
		String header = " ".repeat(longestName.length());
		
		for (Animal animal : animals) {
			header += "|" + animal.getName();
			rowLength += animal.getName().length(); 
		}
		System.out.println("\n" + header);

		
		for (int i = 0; i < animals.size(); i++) {
			String isFriend = "";
			Animal animal = animals.get(i);
			String row = " ".repeat(longestName.length() - animal.getName().length()) + animal.getName();
			
			for (Animal friend : animals) {
				if (friend != animal) {
					isFriend = animal.getFriends().contains(friend) ? "y" : "n";
				}
				else {
					isFriend = "X";
				}
				String emptySpace = " ".repeat(friend.getName().length() -1);
				row += ("|" + isFriend + emptySpace);
				
			}
			System.out.println(row);
			}
		}
	
	
	void initAnimal(Animal animal) {
		animals.add(animal);
	}
	
	void initAnimal(Animal animal, Animal bestFriend) {
		animals.add(animal);
		animal.setBestFriend(bestFriend);
		animal.addFriend(bestFriend, false);
	}
	
	void removeFriendship(Animal animal, Animal friend) {
		if (animal.getFriends().contains(friend)) {
			animal.getFriends().remove(friend);
		}
		else {
			System.out.println(animal.getName() + " and " + friend.getName() + " are not friends!");
		}
	}
	
	void addFriendship(Animal animal, Animal newFriend) {
		if (!animal.getFriends().contains(newFriend)) {
			animal.addFriend(newFriend, false);
		}
		else {
			System.out.println(animal.getName() + " and " + newFriend.getName() + " are already friends!");
		}
	}
	}
	

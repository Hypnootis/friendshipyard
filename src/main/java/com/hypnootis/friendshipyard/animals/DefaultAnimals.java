package com.hypnootis.friendshipyard.animals;

import java.util.ArrayList;

public class DefaultAnimals {
	
	private static ArrayList<Animal> animals = new ArrayList<>();

	public static ArrayList<Animal> initAnimals(){
		
		// Initialize all the default animals, ones specified in the doc
		Dog rex = new Dog("Rex", Dog.Breed.SHEPHERD, "Royal Canin");
		animals.add(rex);
		Dog max = new Dog("Max", Dog.Breed.SHEPHERD, "Purina ONE");
		animals.add(max);
		Dog tom = new Dog("Tom", Dog.Breed.HUSKY, "Royal Canin");
		animals.add(tom);
		Dog jay = new Dog("Jay", Dog.Breed.HUSKY, "Purina ONE");
		animals.add(jay);
		
		Cat zoe = new Cat("Zoe", "9Lives");
		animals.add(zoe);
		Cat ada = new Cat("Ada", "Purina Friskies");
		animals.add(ada);
		
		Chicken meg = new Chicken("Meg", "Purina Layena", true, 0.4d);
		animals.add(meg);
		Chicken lis = new Chicken("Lis", "Manna Pro", true, 0.35d);
		animals.add(lis);
		Chicken emi = new Chicken("Emi", "Purina Layena", false, 0.25d);
		animals.add(emi);
		Chicken lua = new Chicken("Lua", "Manna Pro", false, 0.3d);
		animals.add(lua);
		
		Rooster bob = new Rooster("Bob", "Manna Pro", 0.5d);
		animals.add(bob);
		
		Parrot mac = new Parrot("Mac", "Lafeber Original", 0.33d, true);
		animals.add(mac);
		Parrot alf = new Parrot("Alf", "Kaytee Fiesta", 0.25d, false);
		animals.add(alf);
		
		
		// Initialize default best friends, this would be done separately
		// If not using the default animals
		
		rex.setBestFriend(tom);
		max.setBestFriend(jay);
		tom.setBestFriend(rex);
		jay.setBestFriend(max);
		zoe.setBestFriend(ada);
		ada.setBestFriend(zoe);
		meg.setBestFriend(lis);
		lis.setBestFriend(meg);
		emi.setBestFriend(lua);
		lua.setBestFriend(emi);
		mac.setBestFriend(alf);
		alf.setBestFriend(mac);
		
		for (Animal animal : animals) {
			if (animal.getBestFriend() != null) {
			animal.addFriend(animal.getBestFriend(), false);
			}
			
			else if (animal.getBestFriend() == null){
				animal.setBestFriend(animal);
			}
		}
		return getAnimals();
		
	}
	
	public static ArrayList<Animal> getAnimals(){
		return animals;
	}
}

package com.hypnootis.friendshipyard;

import java.util.ArrayList;

public class InitAnimals {
	
	private static ArrayList<Animal> animals = new ArrayList<Animal>();
	
	static ArrayList<Animal> initDefault() {
		
		animals.clear();
		
		// Initialize all the default animals, ones specified in the doc
		
		Dog rex = new Dog("Rex", "Shepherd", "Royal Canin");
		animals.add(rex);
		Dog max = new Dog("Max", "Shepherd", "Purina ONE");
		animals.add(max);
		Dog tom = new Dog("Tom", "Husky", "Royal Canin");
		animals.add(tom);
		Dog jay = new Dog("Jay", "Husky", "Purina ONE");
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
			animal.addFriend(animal.bestFriend);
		}
		
		return animals;
	}
	
}

package com.hypnootis.friendshipyard;

import java.util.ArrayList;

public class InitAnimals {
	
	private ArrayList<Object> animals = new ArrayList<Object>();
	
	void initDefault() {
		Dog rex = new Dog("Rex", "Shepherd", "Royal Canin", "Tom");
		animals.add(rex);
		Dog max = new Dog("Max", "Shepherd", "Purina ONE", "Jay");
		animals.add(max);
		Dog tom = new Dog("Tom", "Husky", "Royal Canin", "Rex");
		animals.add(tom);
		Dog jay = new Dog("Jay", "Husky", "Purina ONE", "Max");
		animals.add(jay);
		
		Cat zoe = new Cat("Zoe", "9Lives", "Ada");
		animals.add(zoe);
		Cat ada = new Cat("Ada", "Purina Friskies", "Zoe");
		animals.add(ada);
		
		Chicken meg = new Chicken("Meg", "Purina Layena", true, 0.4d, "Lis");
		animals.add(meg);
		Chicken lis = new Chicken("Lis", "Manna Pro", true, 0.35d, "Meg");
		animals.add(lis);
		Chicken emi = new Chicken("Emi", "Purina Layena", false, 0.25d, "Lua");
		animals.add(emi);
		Chicken lua = new Chicken("Lua", "Manna Pro", false, 0.3d, "Emi");
		animals.add(lua);
		
		Rooster bob = new Rooster("Bob", "Manna Pro", 0.5d);
		animals.add(bob);
		
		Parrot mac = new Parrot("Mac", "Lafeber Original", 0.33d, true, "Alf");
		animals.add(mac);
		Parrot alf = new Parrot("Alf", "Kaytee Fiesta", 0.25d, false, "Mac");
		animals.add(alf);
		
		
		
	}
}

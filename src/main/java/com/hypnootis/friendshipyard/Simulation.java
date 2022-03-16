package com.hypnootis.friendshipyard;

import java.util.ArrayList;

public class Simulation {

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Simulation(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	void morning(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			animal.printAttributes();
			
		}
	}
	
}

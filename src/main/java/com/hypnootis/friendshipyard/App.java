package com.hypnootis.friendshipyard;

import com.hypnootis.friendshipyard.animals.DefaultAnimals;

public class App {
    
    public static void main(String[] args) {
    	
    	// Initialize the animals
    	
    	Simulation sim = new Simulation(DefaultAnimals.getAnimals());
    
    	
    	// Simulation.simulateMany() just calls Simulation.simulateDay()
    	// as many times as desired
    	// Set printEvents to true if you want to see all of the events
    	sim.simulateMany(10, true);
    
    }
    
}

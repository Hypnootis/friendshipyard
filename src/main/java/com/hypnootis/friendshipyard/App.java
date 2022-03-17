package com.hypnootis.friendshipyard;

public class App {
    
    public static void main(String[] args) {
    	
    	Simulation sim = new Simulation(InitAnimals.initDefault());
    	
    	sim.simulateMany(10, false);
    }
    
}

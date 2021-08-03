package com.codingdojo.zookeeperpartone;

public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}

package com.aravind.pokemon;

public class Pokemon {
	private String name;
	private String type;
	private int health;
	private static int numPokemon;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		numPokemon++;
	}
	
	public Pokemon(String name, String type) {
		this.name = name;
		this.type = type;
		this.health = 100;
		numPokemon++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getNumPokemon() {
		return numPokemon;
	}
	
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
}

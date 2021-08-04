package com.aravind.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	private static ArrayList<Pokemon> myPokemon = new ArrayList<Pokemon>();
	
	
	public void listPokemon() {
		for(Pokemon pokemon : myPokemon) {
			System.out.println(super.pokemonInfo(pokemon));
		}
	}
	
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = super.createPokemon(name, health, type);
		myPokemon.add(pokemon);
		return pokemon;
	}
	 
}

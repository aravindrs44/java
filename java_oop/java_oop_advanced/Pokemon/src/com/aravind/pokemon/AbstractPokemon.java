package com.aravind.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon hunka = new Pokemon(name, type, health);
		return hunka;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + ", type: " + pokemon.getType() + ", health: " + pokemon.getHealth();
	}
}

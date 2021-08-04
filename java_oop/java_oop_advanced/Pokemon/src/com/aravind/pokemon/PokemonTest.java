package com.aravind.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex hunka = new Pokedex();
		Pokemon mamoswine = hunka.createPokemon("Mamoswine", "Ice and Ground", 424);
		Pokemon garchomp = hunka.createPokemon("Garchomp", "Dragon and Ground", 420);

		
		mamoswine.attackPokemon(garchomp);
		System.out.println(garchomp.getHealth());
		
		hunka.listPokemon();
		
	}

}

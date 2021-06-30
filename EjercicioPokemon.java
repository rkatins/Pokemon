package EjercicioPokemon;

public class EjercicioPokemon {
	
	
	public static void main(String[] args) {
		PokemonFuego oPokemonFuego = new PokemonFuego("Charmander", 100,25);
		PokemonPlanta oPokemonPlanta = new PokemonPlanta("Bulbasaur", 100,25);
		PokemonAgua oPokemonAgua = new PokemonAgua("Squirtle", 100,25);
		Pokemon oPokemon = new Pokemon("Rattata", 100,25);
		
		Combate2(oPokemonAgua, oPokemon);
		
	}
	
	public static void Combate1(PokemonFuego oPokemonFuego, PokemonPlanta oPokemonPlanta) {
		System.out.println(oPokemonFuego.toString() + " VS " + oPokemonPlanta.toString());
		while (!oPokemonFuego.isDead() && !oPokemonPlanta.isDead()) {
			oPokemonFuego.atacar(oPokemonPlanta);
			System.out.println(oPokemonFuego.toString() + " VS " + oPokemonPlanta.toString());
			
			if (oPokemonPlanta.isDead()) {
				System.out.println("Ha muerto " + oPokemonPlanta.getNombre());
			} else {
				oPokemonPlanta.atacar(oPokemonFuego);
				System.out.println(oPokemonFuego.toString() + " VS " + oPokemonPlanta.toString());
				
				if (oPokemonFuego.isDead()) {
					System.out.println("Ha muerto " + oPokemonFuego.getNombre());
				}
			}
		}
	}
	
	public static void Combate2(PokemonAgua oPokemonAgua, Pokemon oPokemon) {
		System.out.println(oPokemonAgua.toString() + " VS " + oPokemon.toString());
		while (!oPokemonAgua.isDead() && !oPokemon.isDead()) {
			
			oPokemonAgua.atacar(oPokemon);
			System.out.println(oPokemonAgua.toString() + " VS " + oPokemon.toString());
			
			if (oPokemon.isDead()) {
				System.out.println("Ha muerto " + oPokemon.getNombre());
			} else {
				oPokemon.atacar(oPokemonAgua);
				System.out.println(oPokemonAgua.toString() + " VS " + oPokemon.toString());
				
				if (oPokemonAgua.isDead()) {
					System.out.println("Ha muerto " + oPokemonAgua.getNombre());
				}
			}
		}
	}
}

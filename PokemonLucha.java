package Pokemon;

public class PokemonLucha extends Pokemon {
	public PokemonLucha(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonLucha(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}	
}

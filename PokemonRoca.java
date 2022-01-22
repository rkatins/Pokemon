package Pokemon;

public class PokemonRoca extends Pokemon{
	public PokemonRoca(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonRoca(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}
}

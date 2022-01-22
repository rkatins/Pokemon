package Pokemon;

public class PokemonSiniestro extends Pokemon{
	public PokemonSiniestro(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonSiniestro(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}
}

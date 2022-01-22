package Pokemon;

public class PokemonPsiquico extends Pokemon {
	public PokemonPsiquico(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonPsiquico(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}
}

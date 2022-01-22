package Pokemon;

public class PokemonPlanta extends Pokemon {
	public PokemonPlanta(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonPlanta(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon pokemonatacado) {
		if (pokemonatacado instanceof PokemonAgua) {
			pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonatacado instanceof PokemonFuego) {
			pokemonatacado.healthPoint = (int) (pokemonatacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonatacado instanceof Pokemon) {
			pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
		}
	}
	
}

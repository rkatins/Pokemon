package Pokemon;

public class PokemonAcero extends Pokemon{
    public PokemonAcero(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonAcero(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon pokemonAtacacado) {
		if (pokemonAtacacado instanceof PokemonAcero) {
			pokemonAtacacado.healthPoint = (int) (pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonAtacacado instanceof PokemonAgua) {
        	pokemonAtacacado.healthPoint = (int) (pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonAtacacado instanceof PokemonBicho) {
        	pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonDragon) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonElectrico) {
			pokemonAtacacado.healthPoint = (int) (pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonAtacacado instanceof PokemonFantasma) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonFuego) {
			pokemonAtacacado.healthPoint = (int) (pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonAtacacado instanceof PokemonHada) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonAtacacado instanceof PokemonHielo) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonAtacacado instanceof PokemonLucha) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof Pokemon) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonPlanta) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonPsiquico) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonRoca) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonAtacacado instanceof PokemonSiniestro) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonTierra) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonVeneno) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacacado instanceof PokemonVolador) {
			pokemonAtacacado.healthPoint = pokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		}
	}
}

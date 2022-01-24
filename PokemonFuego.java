package Pokemon;

public class PokemonFuego extends Pokemon {
	public PokemonFuego(String nombre, int healthPoint, int fuerzaDeAtaque) {
		super(nombre, healthPoint, fuerzaDeAtaque);
	}

	public PokemonFuego(String idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon pokemonAtacado) {
		if (pokemonAtacado instanceof PokemonPlanta) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonAtacado instanceof PokemonAgua) {
			pokemonAtacado.healthPoint = (int) (pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonAtacado instanceof Pokemon) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonAcero) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonAtacado instanceof PokemonBicho) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonAtacado instanceof PokemonDragon) {
            pokemonAtacado.healthPoint = (int) (pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonAtacado instanceof PokemonElectrico) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonAtacado instanceof PokemonFantasma) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonAtacado instanceof PokemonHada) {
        	pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonAtacado instanceof PokemonHielo) {
        	pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonAtacado instanceof PokemonLucha) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonAtacado instanceof PokemonPsiquico) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonAtacado instanceof PokemonRoca) {
        	pokemonAtacado.healthPoint = (int) (pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonAtacado instanceof PokemonSiniestro) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonAtacado instanceof PokemonTierra) {
        	pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonAtacado instanceof PokemonVeneno) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonAtacado instanceof PokemonVolador) {
            pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
        }
	}
}

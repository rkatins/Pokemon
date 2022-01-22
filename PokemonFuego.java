package Pokemon;

public class PokemonFuego extends Pokemon {
	public PokemonFuego(String nombre, int healthPoint, int fuerzaDeAtaque) {
		super(nombre, healthPoint, fuerzaDeAtaque);
	}

	public PokemonFuego(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon pokemonatacado) {
		if (pokemonatacado instanceof PokemonPlanta) {
			pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (pokemonatacado instanceof PokemonAgua) {
			pokemonatacado.healthPoint = (int) (pokemonatacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonatacado instanceof Pokemon) {
			pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonatacado instanceof PokemonAcero) {
			pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonBicho) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonDragon) {
            pokemonatacado.healthPoint = (int) (pokemonatacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonatacado instanceof PokemonElectrico) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonFantasma) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonHada) {
        	pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonHielo) {
        	pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonLucha) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonPsiquico) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonRoca) {
        	pokemonatacado.healthPoint = (int) (pokemonatacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (pokemonatacado instanceof PokemonSiniestro) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonTierra) {
        	pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonVeneno) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonVolador) {
            pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque; 
        }
	}
}

package EjercicioPokemon;

public class PokemonFuego extends Pokemon {

	public PokemonFuego(String isNombre, int iiHealthPoint, int iiFuerzaDeAtaque) {
		super(isNombre, iiHealthPoint, iiFuerzaDeAtaque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Pokemon pokemonatacado) {
		if (pokemonatacado instanceof PokemonPlanta) {
			pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 2;
		} else if (pokemonatacado instanceof PokemonAgua) {
			pokemonatacado.HealthPoint = (int) (pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 0.5);
		} else if (pokemonatacado instanceof Pokemon) {
			pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
		} else if (pokemonatacado instanceof PokemonAcero) {
			pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonBicho) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonDragon) {
            pokemonatacado.HealthPoint = (int) (pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 0.5);
        } else if (pokemonatacado instanceof PokemonElectrico) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonFantasma) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonHada) {
        	pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonHielo) {
        	pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 2;
        } else if (pokemonatacado instanceof PokemonLucha) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonPsiquico) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonRoca) {
        	pokemonatacado.HealthPoint = (int) (pokemonatacado.HealthPoint - this.FuerzaDeAtaque * 0.5);
        } else if (pokemonatacado instanceof PokemonSiniestro) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonTierra) {
        	pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
        } else if (pokemonatacado instanceof PokemonVeneno) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        } else if (pokemonatacado instanceof PokemonVolador) {
            pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque; 
        }
	}
}

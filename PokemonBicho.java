package Pokemon;

public class PokemonBicho extends Pokemon {
    public PokemonBicho(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonBicho(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon PokemonContrincante) {
		if (PokemonContrincante instanceof PokemonAcero) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (PokemonContrincante instanceof PokemonAgua) {
        	PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
        } else if (PokemonContrincante instanceof PokemonBicho) {
        	PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonDragon) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonElectrico) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonFantasma) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonFuego) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonHada) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonHielo) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonLucha) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof Pokemon) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonPlanta) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonContrincante instanceof PokemonPsiquico) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonContrincante instanceof PokemonRoca) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonSiniestro) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonContrincante instanceof PokemonTierra) {
			PokemonContrincante.healthPoint = PokemonContrincante.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonVeneno) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonVolador) {
			PokemonContrincante.healthPoint = (int) (PokemonContrincante.healthPoint - this.fuerzaDeAtaque * 0.5);
		}
	}
}

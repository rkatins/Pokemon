package Pokemon;

public class PokemonAcero extends Pokemon{
    public PokemonAcero(String nombre, int healthPoint, int fuerzaDeAtaque) {
        super(nombre, healthPoint, fuerzaDeAtaque);
    }

	public PokemonAcero(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		super(idPokedex, nombre, healthPoint, fuerzaDeAtaque, defensa, velocidad, fuerzaDeAtaqueEspecial);
	}

	@Override
	public void atacar(Pokemon PokemonAtacacado) {
		if (PokemonAtacacado instanceof PokemonAcero) {
			PokemonAtacacado.healthPoint = (int) (PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (PokemonAtacacado instanceof PokemonAgua) {
        	PokemonAtacacado.healthPoint = (int) (PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
        } else if (PokemonAtacacado instanceof PokemonBicho) {
        	PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonDragon) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonElectrico) {
			PokemonAtacacado.healthPoint = (int) (PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonAtacacado instanceof PokemonFantasma) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonFuego) {
			PokemonAtacacado.healthPoint = (int) (PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (PokemonAtacacado instanceof PokemonHada) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonAtacacado instanceof PokemonHielo) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonAtacacado instanceof PokemonLucha) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof Pokemon) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonPlanta) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonPsiquico) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonRoca) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque * 2;
		} else if (PokemonAtacacado instanceof PokemonSiniestro) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonTierra) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonVeneno) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		} else if (PokemonAtacacado instanceof PokemonVolador) {
			PokemonAtacacado.healthPoint = PokemonAtacacado.healthPoint - this.fuerzaDeAtaque;
		}
	}
}

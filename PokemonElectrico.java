package EjercicioPokemon;

public class PokemonElectrico extends Pokemon {
    public PokemonElectrico(String isNombre, int iiHealthPoint, int iiFuerzaDeAtaque) {
        super(isNombre, iiHealthPoint, iiFuerzaDeAtaque);
    }
    
    @Override
	public void atacar(Pokemon PokemonContrincante) {
		if (PokemonContrincante instanceof PokemonAcero) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
        } else if (PokemonContrincante instanceof PokemonAgua) {
        	PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 2;
        } else if (PokemonContrincante instanceof PokemonBicho) {
        	PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonDragon) {
			PokemonContrincante.HealthPoint = (int) (PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonElectrico) {
			PokemonContrincante.HealthPoint = (int) (PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonFantasma) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonFuego) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonHada) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonHielo) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonLucha) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof Pokemon) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonPlanta) {
			PokemonContrincante.HealthPoint = (int) (PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 0.5);
		} else if (PokemonContrincante instanceof PokemonPsiquico) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonRoca) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonSiniestro) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonTierra) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 0;
		} else if (PokemonContrincante instanceof PokemonVeneno) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque;
		} else if (PokemonContrincante instanceof PokemonVolador) {
			PokemonContrincante.HealthPoint = PokemonContrincante.HealthPoint - this.FuerzaDeAtaque * 2;
		}
	}
}

package EjercicioPokemon;

public class PokemonAgua extends Pokemon {

	public PokemonAgua(String isNombre, int iiHealthPoint, int iiFuerzaDeAtaque) {
		super(isNombre, iiHealthPoint, iiFuerzaDeAtaque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Pokemon pokemonatacado) {
		if (pokemonatacado instanceof PokemonPlanta) {
			pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque*2;
		} else if (pokemonatacado instanceof PokemonFuego) {
			pokemonatacado.HealthPoint = (int) (pokemonatacado.HealthPoint - this.FuerzaDeAtaque*0.5);
		} else if (pokemonatacado instanceof Pokemon) {
			pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
		}
	}
	
	
}

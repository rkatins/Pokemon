package Pokemon;

public class Pokemon {
	protected int idPokedex;
	protected String nombre;
	protected int healthPoint;
	protected int fuerzaDeAtaque;
	protected int defensa;
	protected int velocidad;
	protected int fuerzaDeAtaqueEspecial;
	
	public Pokemon(String nombre, int healthPoint, int fuerzaDeAtaque) {
		this.nombre = nombre;
		this.healthPoint = healthPoint;
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}

	public Pokemon(int idPokedex, String nombre, int healthPoint, int fuerzaDeAtaque, int defensa, int velocidad, int fuerzaDeAtaqueEspecial) {
		this.idPokedex = idPokedex;
		this.nombre = nombre;
		this.healthPoint = healthPoint;
		this.fuerzaDeAtaque = fuerzaDeAtaque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.fuerzaDeAtaqueEspecial = fuerzaDeAtaqueEspecial;
	}



	public String getNombre() {
		return nombre;
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public int getFuerzaDeAtaque() {
		return fuerzaDeAtaque;
	}

	public boolean isDead() {
		if (healthPoint <= 0) {
			return true;	
		}	
		
		return false;
	}
	
	public void atacar(Pokemon pokemonAtacado) {
		if (pokemonAtacado instanceof PokemonAcero) {
			pokemonAtacado.healthPoint = (int) (pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 0.5);
		} else if (pokemonAtacado instanceof PokemonAgua) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonBicho) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonDragon) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonElectrico) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonFantasma) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque * 0;
		} else if (pokemonAtacado instanceof PokemonFuego) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonHada) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonHielo) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonLucha) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof Pokemon) {
			pokemonAtacado.healthPoint = pokemonAtacado.healthPoint - this.fuerzaDeAtaque;
		} else if (pokemonAtacado instanceof PokemonPlanta) {
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

	@Override
	public String toString() {
		if (this.healthPoint < 1) {
			return "Pokemon [Nombre=" + nombre + ", HealthPoint=" + 0 + ", FuerzaDeAtaque=" + fuerzaDeAtaque
					+ "]";
		}
		
		return "Pokemon [Nombre=" + nombre + ", HealthPoint=" + healthPoint + ", FuerzaDeAtaque=" + fuerzaDeAtaque
				+ "]";
	}
}

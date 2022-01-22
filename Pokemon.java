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
	
	public void atacar(Pokemon pokemonatacado) {
		pokemonatacado.healthPoint = pokemonatacado.healthPoint - this.fuerzaDeAtaque;
		
		
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

package EjercicioPokemon;

public class Pokemon {
	protected String Nombre;
	protected int HealthPoint;
	protected int FuerzaDeAtaque;
	
	public Pokemon(String isNombre, int iiHealthPoint, int iiFuerzaDeAtaque) {
		Nombre = isNombre;
		HealthPoint = iiHealthPoint;
		FuerzaDeAtaque = iiFuerzaDeAtaque;
	} // metodo constructor

	public String getNombre() {
		return Nombre;
	}

	public int getHealthPoint() {
		return HealthPoint;
	}

	public int getFuerzaDeAtaque() {
		return FuerzaDeAtaque;
	}

	public boolean isDead() {
		if (HealthPoint <= 0) {
			return true;	
		}	
		
		return false;
	}
	
	public void atacar(Pokemon pokemonatacado) {
		pokemonatacado.HealthPoint = pokemonatacado.HealthPoint - this.FuerzaDeAtaque;
		
		
	}

	@Override
	public String toString() {
		return "Pokemon [Nombre=" + Nombre + ", HealthPoint=" + HealthPoint + ", FuerzaDeAtaque=" + FuerzaDeAtaque
				+ "]";
	}
}

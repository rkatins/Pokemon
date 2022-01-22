package Pokemon;

import java.util.ArrayList;

public class EjercicioPokemon {
	static ArrayList<Pokemon> pokedex = new ArrayList<>();
	static ArrayList<Pokemon> equipo = new ArrayList<>();
	
	public static void main(String[] args) {
		// Al crear el objeto introducir "Nombre", HP (HelathPoint), Fuerza de ataque
//		PokemonFuego PokemonFuego = new PokemonFuego("Charmander", 100, 0); 
//		PokemonPlanta PokemonPlanta = new PokemonPlanta("Bulbasaur", 100, 100);
//		PokemonAgua PokemonAgua = new PokemonAgua("Squirtle", 100, 25);
//		Pokemon Pokemon = new Pokemon("Rattata", 100, 25);
		
		equipo.add(new PokemonFuego(006, "Charizard", 78, 84, 78, 100, 85));
		equipo.add(new PokemonPsiquico(065, "Alakazam", 55, 50, 45, 120, 135));
		equipo.add(new PokemonElectrico(125, "Electabuzz", 65, 83, 57, 105, 85));
		equipo.add(new PokemonFuego(126, "Magmar", 65, 95, 57, 93, 85));
		equipo.add(new PokemonTierra(112, "Rhydon", 105, 130, 120, 40, 45));
		equipo.add(new PokemonAgua(130, "Gyarados", 95, 125, 79, 81, 100));
		
		pokedex.add(new PokemonPlanta(001, "Bulbasaur", 45, 49, 49, 45, 65));
		pokedex.add(new PokemonPlanta(002, "Ivysaur", 60, 62, 63, 60, 80));
		pokedex.add(new PokemonPlanta(003, "Venusaur", 80, 82, 83, 80, 100));
		pokedex.add(new PokemonFuego(004, "Charmander", 39, 52, 43, 65, 50));
		pokedex.add(new PokemonFuego(005, "Charmeleon", 58, 64, 58, 80, 65));
		pokedex.add(new PokemonFuego(006, "Charizard", 78, 84, 78, 100, 85));
		pokedex.add(new PokemonAgua(007, "Squirtle", 44, 48, 65, 43, 50));
//		pokedex.add(new PokemonAgua(008, "Wartortle", 59, 63, 80, 58, 65));
//		pokedex.add(new PokemonAgua(009, "Blastoise", 79, 83, 100, 78, 85));
		pokedex.add(new PokemonBicho(010, "Caterpie", 45, 30, 35, 45, 20));
		pokedex.add(new PokemonBicho(011, "Metapod", 50, 20, 55, 30, 25));
		pokedex.add(new PokemonBicho(012, "Butterfree", 60, 45, 50, 70, 80));
		pokedex.add(new PokemonBicho(013, "Weedle", 40, 35, 30, 50, 20));
		pokedex.add(new PokemonBicho(014, "Kakuna", 45, 25, 50, 35, 25));
		pokedex.add(new PokemonBicho(015, "Beedrill", 65, 80, 40, 75, 45));
		pokedex.add(new Pokemon(016, "Pidgey", 40, 45, 40, 56, 35));
		pokedex.add(new Pokemon(017, "Pidgeotto", 63, 60, 55, 71, 50));
//		pokedex.add(new Pokemon(018, "Pidgeot", 83, 80, 75, 91, 70));
//		pokedex.add(new Pokemon(019, "Rattata", 30, 56, 35, 72, 25));
		pokedex.add(new Pokemon(020, "Raticate", 55, 81, 60, 97, 50));
		pokedex.add(new Pokemon(021, "Spearow", 40, 60, 30, 70, 31));
		pokedex.add(new Pokemon(022, "Fearow", 65, 90, 65, 100, 61));
		pokedex.add(new PokemonVeneno(023, "Ekans", 35, 60, 44, 55, 40));
		pokedex.add(new PokemonVeneno(024, "Arbok", 60, 85, 69, 80, 65));
		pokedex.add(new PokemonElectrico(025, "Pikachu", 35, 55, 30, 90, 50));
		pokedex.add(new PokemonElectrico(026, "Raichu", 60, 90, 55, 100, 90));
		pokedex.add(new PokemonTierra(027, "Sandshrew", 50, 75, 85, 40, 30));
//		pokedex.add(new PokemonTierra(028, "Sandslash", 75, 100, 110, 65, 55));
//		pokedex.add(new PokemonVeneno(029, "Nidoran♀", 55, 47, 52, 41, 40));
		pokedex.add(new PokemonVeneno(030, "Nidorina", 70, 62, 67, 56, 55));
		pokedex.add(new PokemonVeneno(031, "Nidoqueen", 90, 82, 87, 76, 75));
		pokedex.add(new PokemonVeneno(032, "Nidoran♂", 46, 57, 40, 50, 40));
		pokedex.add(new PokemonVeneno(033, "Nidorino", 61, 72, 57, 65, 55));
		pokedex.add(new PokemonVeneno(034, "Nidoking", 81, 92, 77, 85, 75));
		pokedex.add(new PokemonHada(035, "Clefairy", 70, 45, 48, 35, 60));
		pokedex.add(new PokemonHada(036, "Clefable", 95, 70, 73, 60, 85));
		pokedex.add(new PokemonFuego(037, "Vulpix", 38, 41, 40, 65, 65));
//		pokedex.add(new PokemonFuego(038, "Ninetales", 73, 76, 75, 100, 100));
//		pokedex.add(new Pokemon(039, "Jigglypuff", 115, 45, 20, 20, 25));
		pokedex.add(new Pokemon(040, "Wigglytuff", 140, 70, 45, 45, 50));
		pokedex.add(new PokemonVeneno(041, "Zubat", 40, 45, 35, 55, 40));
		pokedex.add(new PokemonVeneno(042, "Golbat", 75, 80, 70, 90, 75));
		pokedex.add(new PokemonPlanta(043, "Oddish", 45, 50, 55, 30, 75));
		pokedex.add(new PokemonPlanta(044, "Gloom", 60, 65, 70, 40, 85));
		pokedex.add(new PokemonPlanta(045, "Vileplume", 75, 80, 85, 50, 100));
		pokedex.add(new PokemonBicho(046, "Paras", 35, 70, 55, 25, 55));
		pokedex.add(new PokemonBicho(047, "Parasect", 60, 95, 80, 30, 80));
//		pokedex.add(new PokemonBicho(048, "Venonat", 60, 55, 50, 45, 40));
//		pokedex.add(new PokemonBicho(049, "Venomoth", 70, 65, 60, 90, 90));
		pokedex.add(new PokemonTierra(050, "Diglett", 10, 55, 25, 95, 45));
		pokedex.add(new PokemonTierra(051, "Dugtrio", 35, 80, 50, 120, 70));
		pokedex.add(new Pokemon(052, "Meowth", 40, 45, 35, 90, 40));
		pokedex.add(new Pokemon(053, "Persian", 65, 70, 60, 115, 65));
		pokedex.add(new PokemonAgua(054, "Psyduck", 50, 52, 48, 55, 50));
		pokedex.add(new PokemonAgua(055, "Golduck", 80, 82, 78, 85, 80));
		pokedex.add(new PokemonLucha(056, "Mankey", 40, 80, 35, 70, 35));
		pokedex.add(new PokemonLucha(057, "Primeape", 65, 105, 60, 95, 60));
//		pokedex.add(new PokemonFuego(058, "Growlithe", 55, 70, 45, 60, 50));
//		pokedex.add(new PokemonFuego(059, "Arcanine", 90, 110, 80, 95, 80));
		pokedex.add(new PokemonAgua(060, "Poliwag", 40, 50, 40, 90, 40));
		pokedex.add(new PokemonAgua(061, "Poliwhirl", 65, 65, 65, 90, 50));
		pokedex.add(new PokemonAgua(062, "Poliwrath", 90, 85, 95, 70, 70));
		pokedex.add(new PokemonPsiquico(063, "Abra", 25, 20, 15, 90, 105));
		pokedex.add(new PokemonPsiquico(064, "Kadabra", 40, 35, 30, 105, 120));
		pokedex.add(new PokemonPsiquico(065, "Alakazam", 55, 50, 45, 120, 135));
		pokedex.add(new PokemonLucha(066, "Machop", 70, 80, 50, 35, 35));
		pokedex.add(new PokemonLucha(067, "Machoke", 80, 100, 70, 45, 50));
//		pokedex.add(new PokemonLucha(068, "Machamp", 90, 130, 80, 55, 65));
//		pokedex.add(new PokemonPlanta(069, "Bellsprout", 50, 75, 35, 40, 70));
		pokedex.add(new PokemonPlanta(070, "Weepinbell", 65, 90, 50, 55, 85));
		pokedex.add(new PokemonPlanta(071, "Victreebel", 80, 105, 65, 70, 100));
		pokedex.add(new PokemonAgua(072, "Tentacool", 40, 40, 35, 70, 100));
		pokedex.add(new PokemonAgua(073, "Tentacruel", 80, 70, 65, 100, 120));
		pokedex.add(new PokemonRoca(074, "Geodude", 40, 80, 100, 20, 30));
		pokedex.add(new PokemonRoca(075, "Graveler", 55, 95, 115, 35, 45));
		pokedex.add(new PokemonRoca(076, "Golem", 80, 110, 130, 45, 55));
		pokedex.add(new PokemonFuego(077, "Ponyta", 50, 85, 55, 90, 65));
//		pokedex.add(new PokemonFuego(078, "Rapidash", 65, 100, 70, 105, 80));
//		pokedex.add(new PokemonAgua(079, "Slowpoke", 90, 65, 65, 15, 40));
//		pokedex.add(new PokemonAgua(080, "Slowbro", 95, 75, 110, 30, 80));
//		pokedex.add(new PokemonElectrico(081, "Magnemite", 25, 35, 70, 45, 95));
//		pokedex.add(new PokemonElectrico(082, "Magneton", 50, 60, 95, 70, 120));
//		pokedex.add(new Pokemon(083, "Farfetch'd", 52, 65, 55, 60, 58));
//		pokedex.add(new Pokemon(084, "Doduo", 35, 85, 45, 75, 35));
//		pokedex.add(new Pokemon(085, "Dodrio", 60, 110, 70, 100, 60));
//		pokedex.add(new PokemonAgua(086, "Seel", 65, 45, 55, 45, 70));
//		pokedex.add(new PokemonAgua(087, "Dewgong", 90, 70, 80, 70, 95));
//		pokedex.add(new PokemonVeneno(088, "Grimer", 80, 80, 50, 25, 40));
//		pokedex.add(new PokemonVeneno(089, "Muk", 105, 105, 75, 50, 65));
//		pokedex.add(new PokemonAgua(090, "Shellder", 30, 65, 100, 40, 45));
//		pokedex.add(new PokemonAgua(091, "Cloyster", 50, 95, 180, 70, 85));
//		pokedex.add(new PokemonFantasma(092, "Gastly", 30, 35, 30, 80, 100));
//		pokedex.add(new PokemonFantasma(093, "Haunter", 45, 50, 45, 95, 115));
//		pokedex.add(new PokemonFantasma(094, "Gengar", 60, 65, 60, 110, 130));
//		pokedex.add(new PokemonRoca(095, "Onix", 35, 45, 160, 70, 30));
//		pokedex.add(new PokemonPsiquico(096, "Drowzee", 60, 48, 45, 42, 90));
//		pokedex.add(new PokemonPsiquico(097, "Hypno", 85, 73, 70, 67, 115));
//		pokedex.add(new PokemonAgua(098, "Krabby", 30, 105, 90, 50, 25));
//		pokedex.add(new PokemonAgua(099, "Kingler", 55, 130, 115, 75, 50));
		pokedex.add(new PokemonElectrico(100, "Voltorb", 40, 30, 50, 100, 55));
		pokedex.add(new PokemonElectrico(101, "Electrode", 60, 50, 70, 140, 80));
		pokedex.add(new PokemonPlanta(102, "Exeggcute", 60, 40, 80, 40, 60));
		pokedex.add(new PokemonPlanta(103, "Exeggutor", 95, 95, 85, 55, 125));
		pokedex.add(new PokemonTierra(104, "Cubone", 50, 50, 95, 35, 40));
		pokedex.add(new PokemonTierra(105, "Marowak", 60, 80, 110, 45, 50));
		pokedex.add(new PokemonLucha(106, "Hitmonlee", 50, 120, 53, 87, 35));
		pokedex.add(new PokemonLucha(107, "Hitmonchan", 50, 105, 79, 76, 35));
		pokedex.add(new Pokemon(108, "Lickitung", 90, 55, 75, 30, 60));
		pokedex.add(new PokemonVeneno(109, "Koffing", 40, 65, 95, 35, 60));
		pokedex.add(new PokemonVeneno(110, "Weezing", 65, 90, 120, 60, 85));
		pokedex.add(new PokemonTierra(111, "Rhyhorn", 80, 85, 95, 25, 30));
		pokedex.add(new PokemonTierra(112, "Rhydon", 105, 130, 120, 40, 45));
		pokedex.add(new Pokemon(113, "Chansey", 250, 5, 5, 50, 105));
		pokedex.add(new PokemonPlanta(114, "Tangela", 65, 55, 115, 60, 100));
		pokedex.add(new Pokemon(115, "Kangaskhan", 105, 95, 80, 90, 40));
		pokedex.add(new PokemonAgua(116, "Horsea", 30, 40, 70, 60, 70));
		pokedex.add(new PokemonAgua(117, "Seadra", 55, 65, 95, 85, 95));
		pokedex.add(new PokemonAgua(118, "Goldeen", 45, 67, 60, 63, 50));
		pokedex.add(new PokemonAgua(119, "Seaking", 80, 92, 65, 68, 80));
		pokedex.add(new PokemonAgua(120, "Staryu", 30, 45, 55, 85, 70));
		pokedex.add(new PokemonAgua(121, "Starmie", 60, 75, 85, 115, 100));
		pokedex.add(new PokemonPsiquico(122, "Mr.Mime", 40, 45, 65, 90, 10));
		pokedex.add(new PokemonBicho(123, "Scyther", 70, 110, 80, 105, 55));
		pokedex.add(new PokemonHielo(124, "Jynx", 65, 50, 35, 95, 95));
		pokedex.add(new PokemonElectrico(125, "Electabuzz", 65, 83, 57, 105, 85));
		pokedex.add(new PokemonFuego(126, "Magmar", 65, 95, 57, 93, 85));
		pokedex.add(new PokemonBicho(127, "Pinsir", 65, 125, 100, 85, 55));
		pokedex.add(new Pokemon(128, "Tauros", 75, 100, 95, 110, 70));
		pokedex.add(new PokemonAgua(129, "Magikarp", 20, 10, 55, 80, 20));
		pokedex.add(new PokemonAgua(130, "Gyarados", 95, 125, 79, 81, 100));
		pokedex.add(new PokemonAgua(131, "Lapras", 130, 85, 80, 60, 95));
		pokedex.add(new Pokemon(132, "Ditto", 48, 48, 48, 48, 48));
		pokedex.add(new Pokemon(133, "Eevee", 55, 55, 50, 55, 65));
		pokedex.add(new PokemonAgua(134, "Vaporeon", 130, 65, 60, 65, 110));
		pokedex.add(new PokemonElectrico(135, "Jolteon", 65, 65, 60, 130, 110));
		pokedex.add(new PokemonFuego(136, "Flareon", 65, 130, 60, 65, 110));
		pokedex.add(new Pokemon(137, "Porygon", 65, 60, 70, 40, 75));
		pokedex.add(new PokemonRoca(138, "Omanyte", 35, 40, 100, 35, 90));
		pokedex.add(new PokemonRoca(139, "Omastar", 70, 60, 125, 55, 115));
		pokedex.add(new PokemonRoca(140, "Kabuto", 30, 80, 90, 55, 45));
		pokedex.add(new PokemonRoca(141, "Kabutops", 60, 115, 105, 80, 70));
		pokedex.add(new PokemonRoca(142, "Aerodactyl", 80, 105, 65, 130, 60));
		pokedex.add(new Pokemon(143, "Snorlax", 160, 110, 65, 30, 65));
		pokedex.add(new PokemonHielo(144, "Articuno", 90, 85, 100, 85, 125));
		pokedex.add(new PokemonElectrico(145, "Zapdos", 90, 90, 85, 100, 125));
		pokedex.add(new PokemonFuego(146, "Moltres", 90, 100, 90, 90, 125));
		pokedex.add(new PokemonDragon(147, "Dratini", 41, 64, 45, 50, 50));
		pokedex.add(new PokemonDragon(148, "Dragonair", 61, 84, 65, 70, 70));
		pokedex.add(new PokemonDragon(149, "Dragonite", 91, 134, 95, 80, 100));
		pokedex.add(new PokemonPsiquico(150, "Mewtwo", 100, 110, 90, 130, 154));
		pokedex.add(new PokemonPsiquico(151, "Mew", 100, 100, 100, 100, 100));
		
//		Combate1(PokemonFuego, PokemonPlanta);
//		Combate2(PokemonAgua, Pokemon);
		
		System.out.println((int) (Math.random() * pokedex.size()));
		
		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).healthPoint > 0) {
				Combate(equipo.get(i), pokedex.get((int) (Math.random() * pokedex.size() + 1)));
				i = equipo.size();
			}
		}
	}
	
	public static void Combate1(PokemonFuego PokemonFuego, PokemonPlanta PokemonPlanta) {
		System.out.println(PokemonFuego.toString() + " VS " + PokemonPlanta.toString());
		System.out.println("\n");
		
		while (!PokemonFuego.isDead() && !PokemonPlanta.isDead()) {
			PokemonFuego.atacar(PokemonPlanta);
			System.out.println(PokemonFuego.getNombre() + " ataca a " + PokemonPlanta.getNombre());
			System.out.println(PokemonFuego.toString() + " VS " + PokemonPlanta.toString());
			System.out.println("\n");
			
			if (PokemonPlanta.isDead()) {
				System.out.println("Ha muerto " + PokemonPlanta.getNombre());
				System.out.println("\n");
			} else {
				PokemonPlanta.atacar(PokemonFuego);
				System.out.println(PokemonPlanta.getNombre() + " ataca a " + PokemonFuego.getNombre());
				System.out.println(PokemonFuego.toString() + " VS " + PokemonPlanta.toString());
				System.out.println("\n");
				
				if (PokemonFuego.isDead()) {
					System.out.println("Ha muerto " + PokemonFuego.getNombre());
					System.out.println("\n");
				}
			}
		}
	}
	
	public static void Combate2(PokemonAgua PokemonAgua, Pokemon Pokemon) {
		System.out.println(PokemonAgua.toString() + " VS " + Pokemon.toString());
		while (!PokemonAgua.isDead() && !Pokemon.isDead()) {
			
			PokemonAgua.atacar(Pokemon);
			System.out.println(PokemonAgua.getNombre() + " ataca a " + Pokemon.getNombre());
			System.out.println(PokemonAgua.toString() + " VS " + Pokemon.toString());
			
			if (Pokemon.isDead()) {
				System.out.println("Ha muerto " + Pokemon.getNombre());
			} else {
				Pokemon.atacar(PokemonAgua);
				System.out.println(Pokemon.getNombre() + " ataca a " + PokemonAgua.getNombre());
				System.out.println(PokemonAgua.toString() + " VS " + Pokemon.toString());
				
				if (PokemonAgua.isDead()) {
					System.out.println("Ha muerto " + PokemonAgua.getNombre());
				}
			}
		}
	}
	
	public static void Combate(Pokemon equipoPokemon, Pokemon atacantePokemon) {
		System.out.println(equipoPokemon.toString() + " VS " + atacantePokemon.toString());
		System.out.println("\n");
		while (!equipoPokemon.isDead() && !atacantePokemon.isDead()) {
			equipoPokemon.atacar(atacantePokemon);
			System.out.println(equipoPokemon.getNombre() + " ataca a " + atacantePokemon.getNombre());
			System.out.println(equipoPokemon.toString() + " VS " + atacantePokemon.toString());
			System.out.println("\n");
			
			if (atacantePokemon.isDead()) {
				System.out.println("Ha muerto " + atacantePokemon.getNombre());
				System.out.println("\n");
			} else {
				atacantePokemon.atacar(equipoPokemon);
				System.out.println(atacantePokemon.getNombre() + " ataca a " + equipoPokemon.getNombre());
				System.out.println(equipoPokemon.toString() + " VS " + atacantePokemon.toString());
				System.out.println("\n");
				
				if (equipoPokemon.isDead()) {
					System.out.println("Ha muerto " + equipoPokemon.getNombre());
					System.out.println("\n");
				}
			}
		}
	}
}

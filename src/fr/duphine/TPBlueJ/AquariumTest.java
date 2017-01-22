package fr.duphine.TPBlueJ;

import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers.*;
// import org.hamcrest.Matchers.*;

import org.junit.Test;

public class AquariumTest {
	private Poisson poisson = new Poisson("Pp");
	private Aquarium aqua = new Aquarium("commun");
	
	@Test
	public void testAquarium() {
		//fail("Not yet implemented");		
	}

	@Test
	public void testGetPopulation() {
		//fail("Not yet implemented");
		aqua.ajouterHabitant(poisson);
		assertEquals("le nombre d'habitant est: 1",aqua.getHabitant());
	}

	@Test
	public void testSetPopulation() {
		//fail("Not yet implemented");
		aqua.ajouterHabitant(poisson);
	}

}

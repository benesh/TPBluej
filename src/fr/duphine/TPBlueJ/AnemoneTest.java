package fr.duphine.TPBlueJ;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnemoneTest {
	Poisson pp = new Poisson("ami");
	Anemone an = new Anemone(pp);

	@Test
	public void testEstHabitePar() {
		//fail("Not yet implemented");
		assertEquals("ami habite ici",an.estHabitePar());
	}

}

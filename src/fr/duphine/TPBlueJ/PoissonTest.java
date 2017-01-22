package fr.duphine.TPBlueJ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PoissonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PoissonTest
{
	Aquarium aqua = new Aquarium("aquarium");
    /**
     * Default constructor for test class PoissonTest
     */
    public PoissonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void identeTest()
    {
        Poisson poisson1 = new Poisson("nemo");
        poisson1.setEspece("clown");
        poisson1.setMaison(aqua);
        assertEquals("Je suis nemo, un poisson clown qui sait nager", poisson1.identite()); 
    }

    @Test
    public void habiteParTest()
    {
        Poisson poisson1 = new Poisson("nemo");
        Anemone anemone1 = new Anemone(poisson1);
        assertEquals("nemo habite ici", anemone1.estHabitePar());
    }
}




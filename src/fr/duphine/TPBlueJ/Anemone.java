package fr.duphine.TPBlueJ;

/**
 * Write a description of class Anemone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anemone
{
    // instance variables - replace the example below with your own
    private Poisson habitant;

    /**
     * Constructor for objects of class Anemone
     */
    public Anemone(Poisson habitant)
    {
        // initialise instance variables
        this.habitant = habitant;
    }
    
    public String estHabitePar()
    {
        return habitant.getNom()+" habite ici"; 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}

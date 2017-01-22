package fr.duphine.TPBlueJ;

/**
 * Write a description of class Poisson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poisson
{
    // instance variables - replace the example below with your own
    private String nom;
    private String espece;
    private Aquarium maison;
      

    /**
     * Constructor for objects of class Poisson
     */
    public Poisson(String nom)
    {
        // initialise instance variables
        this.nom = nom;
        this.espece = "commun";
    }
    
    public String getNom(){
        return this.nom; 
    }
    public String getEspece(){
        return this.espece; 
    }
    public String getMaison()
    {
    	return this.maison.getNom();
    }
    public void setEspece(String espece){
        this.espece=espece; 
    }
    public void setMaison(Aquarium aqua){
    	this.maison=aqua;
    }
    public String identite(){
        return "Je suis "+getNom()+", un poisson "+getEspece()+" qui sait nager"; 
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //public int sampleMethod(int y)
    //{
        // put your code here
        //return  + y;
    //}
}

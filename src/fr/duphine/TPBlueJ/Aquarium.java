package fr.duphine.TPBlueJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

	//déclaration de la liste
	private List<Poisson> population;
	private String nom;
	
	
	public Aquarium(String nom){
		//instanciation de la liste en Array
		population = new ArrayList();
		this.nom = nom;
	}
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public void  ajouterHabitant(Poisson p){
		//ajoute un habitant après avoir vérifier s'il n'existe pas déjà dans la liste 
		if(!population.contains(p))
		population.add(p);
	}	
	public String getHabitant(){
		return  "le nombre d'habitant est: "+population.size();
	}
	
	
}






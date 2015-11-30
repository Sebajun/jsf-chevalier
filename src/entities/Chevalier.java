package entities;


import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Chevalier {

	//attributs
 
	private String    nom;

    private String    arme;
    
    private String origine;
    
    //constructeurs

	public Chevalier(String nom, String arme, String origine) {
		this.nom = nom;
		this.arme = arme;
		this.origine = origine;
	}
	
	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArme() {
		return arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}
}
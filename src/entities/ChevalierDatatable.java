package entities;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class ChevalierDatatable {
	
	private List<Chevalier> chevaliers = new ArrayList<Chevalier>();

	public ChevalierDatatable() {
		this.chevaliers.add(new Chevalier("Artur", "Epee", "Bretagne"));
		this.chevaliers.add(new Chevalier("Artur", "Epee", "Bretagne"));
		this.chevaliers.add(new Chevalier("Artur", "Epee", "Bretagne"));
		this.chevaliers.add(new Chevalier("Artur", "Epee", "Bretagne"));
		
	}

	public String register() {
		return "registrationInfo";
	}

	public List<Chevalier> getchevaliers() {
		return chevaliers;
	}

	public void setchevaliers(ArrayList<Chevalier> chevaliers) {
		this.chevaliers = chevaliers;
	}
	
}

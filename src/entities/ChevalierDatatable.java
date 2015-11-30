package entities;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import jdbc.DatabaseAccess;


@ManagedBean
@SessionScoped

public class ChevalierDatatable {
	
	private List<Chevalier> chevaliers = new ArrayList<Chevalier>();

	public ChevalierDatatable() {
		
		//on recupère les chevaliers dans la base
		try {
			ResultSet rs = DatabaseAccess.executeQuery("select * from chevalier");
			chevaliers = resultSetToArrayList(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	
	public List<Chevalier> resultSetToArrayList(ResultSet rs) throws SQLException
	{
		List<Chevalier> chevaliers = new ArrayList<Chevalier>();
		while(rs.next())
		{
			Chevalier c = new Chevalier(rs.getString(2),rs.getString(3),rs.getString(4));
			chevaliers.add(c);
		}
		return chevaliers;
	}
	
}

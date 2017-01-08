package gestion_de_vols;

public class Aeroport 
{
	public static int nbrAero;
	private String nomAeroport;
	private int idAeroport;
	public Ville ville;
	public Volcomplet[] arrive;
	public Volcomplet[] depart;
	public InfosEscale[] escale;
	   
	public Aeroport(String nomAeroport,Ville ville) 
	{
	      this.ville=ville;
	      this.nomAeroport=nomAeroport;
	      this.idAeroport=nbrAero;
	      nbrAero++;
	}
	
	public int getIdAeroport() 
	{
		return idAeroport;
	}

	public void setIdAeroport(int idAeroport) 
	{
		this.idAeroport = idAeroport;
	}

	public InfosEscale[] getEscale() 
	{
		return escale;
	}

	public void setEscale(InfosEscale[] escale) 
	{
		this.escale = escale;
	}

	public String getNomAeroport() 
	{
	   return nomAeroport;
	}
	   
	public void setNomAeroport(String newNomAeroport) 
	{
	   nomAeroport = newNomAeroport;
	}
	   
	   
	public Ville getVille() 
	{
	   return ville;
	}
	  
	public void setVille(Ville newVille) 
	{
	   this.ville = newVille;
	}
	 
	public Volcomplet[] getArrive() 
	{
	   return arrive;
	}
	   
	public void setArrive(Volcomplet[] newArrive) 
	{
	   this.arrive = newArrive;
	}
	
	public Volcomplet[] getDepart() 
	{
	   return depart;
	}
	   
	public void setDepart(Volcomplet[] newDepart) 
	{
	   this.depart = newDepart;
	}
}

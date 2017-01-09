package gestion_de_vols;
public class Ville 
{
	public static int nbrvil;
	private int idVille;
	private String nomVille;
	private int codePostale;
	public Aeroport[] aeroport;
	   
	public Ville(String nomVille, int codePostale) 
	{
		this.idVille = nbrvil;
		this.nomVille = nomVille;
		this.codePostale = codePostale;
		nbrvil++;
	}

	public int getIdVille() 
	{
		return idVille;
	}

	public void setIdVille(int idVille) 
	{
		this.idVille = idVille;
	}

	public String getNomVille() 
	{
		return nomVille;
	}

	public void setNomVille(String nomVille) 
	{
		this.nomVille = nomVille;
	}

	public int getCodePostale() 
	{
		return codePostale;
	}

	public void setCodePostale(int codePostale) 
	{
		this.codePostale = codePostale;
	}

	public Aeroport[] getAeroport() 
	{
	   return aeroport;
	}
	   
	public void setAeroport(Aeroport[] newAeroport) 
	{
	   this.aeroport = newAeroport;
	}
	
}


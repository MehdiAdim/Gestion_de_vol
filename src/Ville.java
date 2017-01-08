package gestion_de_vols;

public class Ville 
{
	private int idVille;
	private String nomVille;
	private int codePostale;
	   
	public Aeroport[] aeroport;
	   
	   
	
	
	public Ville(int idVille, String nomVille, int codePostale) 
	{
		this.idVille = idVille;
		this.nomVille = nomVille;
		this.codePostale = codePostale;
	}

	public int getIdVille() 
	{
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
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


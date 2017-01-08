package gestion_de_vols;
import java.util.*;
public class Volcomplet 
{
	private static int nbrvc;
	private boolean ouvert;
	private int numeroVol;
	private Date dateArriveVol;
	private Date dateDepartVol;
	private String jour;
	public Aeroport arrive;
	public Aeroport depart;
	public Collection escale;
	public Compagnieaerienne compagnieaerienne;
	public Vol[] vol;
	
	public Volcomplet(Date ArV,Date DeV,String j,Aeroport ar,Aeroport de,Collection escale,Compagnieaerienne ca) 
	{
		this.numeroVol = nbrvc;
		this.ouvert = true;
		this.dateArriveVol = ArV;
		this.dateDepartVol = DeV;
		this.jour = j;
		this.arrive = ar;
		this.depart = de;
		this.escale = escale;
		this.compagnieaerienne = ca;
		nbrvc++;
	}
	
	public boolean isOuvert() 
	{
		return ouvert;
	}
	
	public void setOuvert(boolean ouvert) 
	{
		this.ouvert = ouvert;
	}

	
	public int getNumeroVol() 
	{
		return numeroVol;
	}

	public void setNumeroVol(int numeroVol) 
	{
		this.numeroVol = numeroVol;
	}

	public Date getDateArriveVol() 
	{
		return dateArriveVol;
	}

	public void setDateArriveVol(Date dateArriveVol) 
	{
		this.dateArriveVol = dateArriveVol;
	}

	public Date getDateDepartVol() 
	{
		return dateDepartVol;
	}

	public void setDateDepartVol(Date dateDepartVol) 
	{
		this.dateDepartVol = dateDepartVol;
	}

	public String getJour() 
	{
		return jour;
	}

	public void setJour(String jour) 
	{
		this.jour = jour;
	}

	public Collection getEscale() 
	{
		return escale;
	}

	public void setEscale(Collection escale) 
	{
		this.escale = escale;
	}

	public void ouvrirReservation() 
	{
		this.ouvert = true;
	}
	   
	public void fermerReservation() 
	{
		this.ouvert = false;
	}
	   
	public double calculerDuree() 
	{
	   return 0;
	}
	   
	public Aeroport getArrive() 
	{
	   return arrive;
	}
	   
	public void setArrive(Aeroport newAeroport) 
	{
	   this.arrive = newAeroport;
	}
	public Aeroport getDepart() 
	{
	   return depart;
	}
	   
	public void setDepart(Aeroport newAeroport) 
	{
	   this.depart = newAeroport;
	}
	public Compagnieaerienne getCompagnieaerienne() 
	{
	   return compagnieaerienne;
	}
	  
	public void setCompagnieaerienne(Compagnieaerienne newCompagnieaerienne)
	{
	   if (this.compagnieaerienne == null || !this.compagnieaerienne.equals(newCompagnieaerienne))
	   {
	      if (this.compagnieaerienne != null)
	      {
	         Compagnieaerienne oldCompagnieaerienne = this.compagnieaerienne;
	         this.compagnieaerienne = null;
	         oldCompagnieaerienne.removeVolcomplet(this);
	      }
	      if (newCompagnieaerienne != null)
	      {
	         this.compagnieaerienne = newCompagnieaerienne;
	         this.compagnieaerienne.addVolcomplet(this);
	      }
	   }
	}
	public Vol[] getVol() 
	{
	   return vol;
	}
	
	public void setVol(Vol[] newVol) 
	{
	   this.vol = newVol;
	}
}

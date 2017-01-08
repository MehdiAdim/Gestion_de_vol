package gestion_de_vols;
import java.util.*;
public class InfosEscale extends Aeroport
{
	private double heureDepartEscale;
	private double heureArriveeEscale;
	public Volcomplet escale;
	public Aeroport escal;
	   
	public double getHeureDepartEscale() 
	{
		return heureDepartEscale;
	}

	public void setHeureDepartEscale(double heureDepartEscale) 
	{
		this.heureDepartEscale = heureDepartEscale;
	}

	public double getHeureArriveeEscale() 
	{
		return heureArriveeEscale;
	}

	public void setHeureArriveeEscale(double heureArriveeEscale) 
	{
		this.heureArriveeEscale = heureArriveeEscale;
	}

	public Volcomplet getEscale() 
	{
		return this.escale;
	}

	public void setEscale(Volcomplet escale) 
	{
		this.escale = escale;
	}

	public Aeroport getEscal() 
	{
		return escal;
	}

	public void setEscal(Aeroport escal) 
	{
		this.escal = escal;
	}

	public double calculerDuree() 
	{
	   return heureArriveeEscale-heureDepartEscale;
	}

	public InfosEscale(String Aeroport,Ville ville,double Depart,double Arrivee,Volcomplet escale) 
	{
		super(Aeroport, ville);
		this.heureDepartEscale = Depart;
		this.heureArriveeEscale = Arrivee;
		this.escale = escale;
	}
}


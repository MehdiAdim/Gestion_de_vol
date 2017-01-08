package gestion_de_vols;
import java.util.*;
public class Reservation 
{
	
	private static int nbrres;
	private boolean confirmee;
	private boolean annulee;
	private int numeroReservation;
	private Date dateReservation;
	public Passager passager;
	public Client client;
	public Vol vol;
	
	
	public Reservation(Date dateReservation,Passager passager,Client client,Vol vol) 
	{
		this.confirmee=false;
		this.annulee=false;
		this.numeroReservation =nbrres;
		this.dateReservation = dateReservation;
		this.passager = passager;
		this.client = client;
		this.vol = vol;
		nbrres++;
	}
	

	public int getNumeroReservation() 
	{
		return numeroReservation;
	}
	
	public void setNumeroReservation(int numeroReservation) 
	{
		this.numeroReservation = numeroReservation;
	}

	public Date getDateReservation() 
	{
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) 
	{
		this.dateReservation = dateReservation;
	}

	public void annuler() 
	{
		this.annulee=true;
	}
	   
	public void confirmer() 
	{
		this.confirmee=true;     
	}
	   
	   
	public Passager getPassager() 
	{
	  return passager;
	}
	   
	   
	public void setPassager(Passager newPassager) 
	{
		this.passager = newPassager;
	}
	   
	   
	public Client getClient() 
	{
	   return client;
	}
	   
	public void setClient(Client newClient) 
	{
	   this.client = newClient;
	}
	public Vol getVol() 
	{
	   return vol;
	}
	 
	public void setVol(Vol newVol) 
	{
	   if (this.vol == null || !this.vol.equals(newVol))
	   {
	      if (this.vol != null)
	      {
	         Vol oldVol = this.vol;
	         this.vol = null;
	         oldVol.removeReservation(this);
	      }
	      if (newVol != null)
	      {
	         this.vol = newVol;
	         this.vol.addReservation(this);
	      }
	    }
	 }
}


package gestion_de_vols;
import java.util.*;
public class Vol 
{
	private Date datedepart;
	private Date datearive;
	private int idVol;
	public java.util.Collection<Reservation> reservation;
	public Volcomplet volcomplet;
	public Compagnieaerienne[] compagnieaerienne;
	
	
	public Vol(Date datedepart, Date datearive, int idVol, Compagnieaerienne[] compagnieaerienne) {
		super();
		this.datedepart = datedepart;
		this.datearive = datearive;
		this.idVol = idVol;
		this.compagnieaerienne = compagnieaerienne;
	}
		
	public Date getDatedepart() 
	{
		return datedepart;
	}

	public void setDatedepart(Date datedepart) 
	{
		this.datedepart = datedepart;
	}

	public Date getDatearive() 
	{
		return datearive;
	}

	public void setDatearive(Date datearive) 
	{
		this.datearive = datearive;
	}

	public int getIdVol() 
	{
		return idVol;
	}

	public void setIdVol(int idVol) 
	{
		this.idVol = idVol;
	}

	public Double calculeDuree() 
	{
	   return null;
	}
	   
	   
	public Collection<Reservation> getReservation() 
	{
	   if (reservation == null)
	      reservation = new HashSet<Reservation>();
	   return reservation;	
	}
	   
	public Iterator getIteratorReservation() 
	{
		if (reservation == null)
			reservation = new HashSet<Reservation>();
		return reservation.iterator();
	}
	   
	public void setReservation(Collection<Reservation> newReservation) 
	{
	   removeAllReservation();
	   for (Iterator iter = newReservation.iterator(); iter.hasNext();)
		   addReservation((Reservation)iter.next());
	}
	   
	public void addReservation(Reservation newReservation) 
	{
	   if (newReservation == null)
	      return;
	   if (this.reservation == null)
	      this.reservation = new HashSet<Reservation>();
	   if (!this.reservation.contains(newReservation))
	   {
	      this.reservation.add(newReservation);
	      newReservation.setVol(this);      
	   }
	}
	   
	public void removeReservation(Reservation oldReservation) 
	{
	   if (oldReservation == null)
	      return;
	   if (this.reservation != null)
	      if (this.reservation.contains(oldReservation))
	      {
	         this.reservation.remove(oldReservation);
	         oldReservation.setVol((Vol)null);
	      }
	}
	   
	public void removeAllReservation() 
	{
	   if (reservation != null)
	   {
	      Reservation oldReservation;
	      for (Iterator iter = getIteratorReservation(); iter.hasNext();)
	      {
	         oldReservation = (Reservation)iter.next();
	         iter.remove();
	         oldReservation.setVol((Vol)null);
	      }
	   }
	}
	


	public Volcomplet getVolcomplet() 
	{
	   return volcomplet;
	}
	
	public void setVolcomplet(Volcomplet newVolcomplet) 
	{
	   this.volcomplet = newVolcomplet;
	}
	public Compagnieaerienne[] getCompagnieaerienne() 
	{
	   return compagnieaerienne;
	}
	 
	public void setCompagnieaerienne(Compagnieaerienne[] newCompagnieaerienne) 
	{
	   this.compagnieaerienne = newCompagnieaerienne;
	}
}

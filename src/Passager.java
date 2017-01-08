package gestion_de_vols;

public class Passager 
{
	private String nomPassager;
	private String prenomPassager;
	   
	public Reservation[] reservation;
	   
	public Passager(String nomPassager,String prenomPassager) 
	{
		this.nomPassager= nomPassager;
		this.prenomPassager=prenomPassager;
	}
	
	  
	public String getNomPassager() 
	{
		return nomPassager;
	}


	public void setNomPassager(String nomPassager) 
	{
		this.nomPassager = nomPassager;
	}


	public String getPrenomPassager() 
	{
		return prenomPassager;
	}


	public void setPrenomPassager(String prenomPassager) 
	{
		this.prenomPassager = prenomPassager;
	}


	public Reservation[] getReservation() 
	{
		return reservation;
	}
	   
	public void setReservation(Reservation[] newReservation) 
	{
		this.reservation = newReservation;
    }
}


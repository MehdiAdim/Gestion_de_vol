package gestion_de_vols;

public class Client 
{
	private String CIN;
	private String prenomClient;
	private String adresseClient;
	private long telClient;
	private long numFaxClient;
	public Reservation[] reservation;
	  
	public Client(String CIN,String prenomClient,String adresseClient) 
	{
		this.CIN=CIN;
		this.prenomClient=prenomClient;
		this.adresseClient=adresseClient;
	}
	   
	public String getCIN() 
	{
		return CIN;
	}

	public void setCIN(String cIN) 
	{
		CIN = cIN;
	}

	public String getPrenomClient() 
	{
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) 
	{
		this.prenomClient = prenomClient;
	}

	public String getAdresseClient() 
	{
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) 
	{
		this.adresseClient = adresseClient;
	}

	public long getTelClient() 
	{
		return telClient;
	}

	public void setTelClient(long telClient) 
	{
		this.telClient = telClient;
	}

	public long getNumFaxClient() 
	{
		return numFaxClient;
	}

	public void setNumFaxClient(long numFaxClient) {
		this.numFaxClient = numFaxClient;
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


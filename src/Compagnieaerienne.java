package gestion_de_vols;
import java.util.*;
public class Compagnieaerienne 
{
	public static int nbrca;
	private int idComp;
	private String nomCompAirien;
	public java.util.Collection<Volcomplet> volcomplet;
	public java.util.Collection<Vol> vol;
	public java.util.Collection<Client> client;
		   
	   
	public Compagnieaerienne( String nomCompAirien) 
	{
		this.idComp = nbrca;
		this.nomCompAirien = nomCompAirien;
		nbrca++;
	}
	
	public int getIdComp() 
	{
		return idComp;
	}

	public void setIdComp(int idComp) 
	{
		this.idComp = idComp;
	}

	public String getNomCompAirien() 
	{
		return nomCompAirien;
	}

	public void setNomCompAirien(String nomCompAirien) 
	{
		this.nomCompAirien = nomCompAirien;
	}

	public Collection<Volcomplet> getVolcomplet() 
	{
	   if (volcomplet == null)
	      volcomplet = new HashSet<Volcomplet>();
	   return volcomplet;
	}
	   
	public Iterator getIteratorVolcomplet() 
	{
	   if (volcomplet == null)
	      volcomplet = new HashSet<Volcomplet>();
	   return volcomplet.iterator();
	}
	   
	public void setVolcomplet(Collection<Volcomplet> newVolcomplet) 
	{
	   removeAllVolcomplet();
	   for (Iterator iter = newVolcomplet.iterator(); iter.hasNext();)
	      addVolcomplet((Volcomplet)iter.next());
	}
	   
	public void addVolcomplet(Volcomplet newVolcomplet) 
	{
		if (newVolcomplet == null)
			return;
		if (this.volcomplet == null)
			this.volcomplet = new HashSet<Volcomplet>();
	    if (!this.volcomplet.contains(newVolcomplet))
	    {
	       this.volcomplet.add(newVolcomplet);
	       newVolcomplet.setCompagnieaerienne(this);      
	    }
	}
	   
	public void removeVolcomplet(Volcomplet oldVolcomplet) 
	{
		if (oldVolcomplet == null)
	    return;
	    if (this.volcomplet != null)
	      if (this.volcomplet.contains(oldVolcomplet))
	      {
	         this.volcomplet.remove(oldVolcomplet);
	         oldVolcomplet.setCompagnieaerienne((Compagnieaerienne)null);
	      }
	}
	   
	public void removeAllVolcomplet() 
	{
	   if (volcomplet != null)
	   {
	      Volcomplet oldVolcomplet;
	      for (Iterator iter = getIteratorVolcomplet(); iter.hasNext();)
	      {
	         oldVolcomplet = (Volcomplet)iter.next();
	         iter.remove();
	         oldVolcomplet.setCompagnieaerienne((Compagnieaerienne)null);
	      }
	   }
	}
	public Collection<Vol> getVol() 
	{
	   if (vol == null)
	      vol = new HashSet<Vol>();
	   return vol;
	}
	
	public Iterator getIteratorVol() 
	{
	   if (vol == null)
	      vol = new HashSet<Vol>();
	   return vol.iterator();
	}
	
	public void setVol(Collection<Vol> newVol) 
	{
	   removeAllVol();
	   for (Iterator iter = newVol.iterator(); iter.hasNext();)
	      addVol((Vol)iter.next());
	}
	
	public void addVol(Vol newVol) 
	{
	   if (newVol == null)
	      return;
	   if (this.vol == null)
	      this.vol = new HashSet<Vol>();
	   if (!this.vol.contains(newVol))
	      this.vol.add(newVol);
	}
	
	public void removeVol(Vol oldVol) 
	{
	   if (oldVol == null)
	      return;
	   if (this.vol != null)
	      if (this.vol.contains(oldVol))
	         this.vol.remove(oldVol);
	}
	
	public void removeAllVol() 
	{
	   if (vol != null)
	     vol.clear();
	}
	public Collection<Client> getClient() 
	{
	   if (client == null)
	      client = new HashSet<Client>();
	   return client;
	}
	public Iterator getIteratorClient() 
	{
	    if (client == null)
	      client = new HashSet<Client>();
	   return client.iterator();
	}
	
	public void setClient(Collection<Client> newClient) 
	{
	   removeAllClient();
	   for (Iterator iter = newClient.iterator(); iter.hasNext();)
	      addClient((Client)iter.next());
	}
	
	public void addClient(Client newClient) 
	{
	   if (newClient == null)
	      return;
	   if (this.client == null)
	      this.client = new HashSet<Client>();
	   if (!this.client.contains(newClient))
	      this.client.add(newClient);
	}
	
	public void removeClient(Client oldClient) 
	{
	   if (oldClient == null)
	      return;
	   if (this.client != null)
	      if (this.client.contains(oldClient))
	         this.client.remove(oldClient);
	}
	
	public void removeAllClient() 
	{
	   if (client != null)
	      client.clear();
	}	
}


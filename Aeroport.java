/***********************************************************************
 * Module:  Aeroport.java
 * Author:  simo
 * Purpose: Defines the Class Aeroport
 ***********************************************************************/

import java.util.*;

/** @pdOid 1b811158-d867-4344-a0bb-03355e468b88 */
public class Aeroport {
   /** @pdOid 7aa81150-711a-480e-b397-7d0bca1b944d */
   private String nomAeroport;
   /** @pdOid 060bee39-4bf0-42a7-9ec6-8cd58500f3e9 */
   private int idAeroport;
   
   /** @pdRoleInfo migr=no name=Ville assc=dessert mult=1..* */
   public Ville[] ville;
   /** @pdRoleInfo migr=no name=Volcomplet assc=arrivee mult=0..* side=A */
   public Volcomplet[] arrive;
   /** @pdRoleInfo migr=no name=Volcomplet assc=depart mult=0..* side=A */
   public Volcomplet[] depart;
   public InfosEscale[] escale;
   
   /** @pdOid 33e8f7de-a61a-4f81-9555-9506e6ce4ee7 */
   public String getNomAeroport() {
      return nomAeroport;
   }
   
   /** @param newNomAeroport
    * @pdOid 5fcaf332-9093-4905-ae71-abc39166f76b */
   public void setNomAeroport(String newNomAeroport) {
      nomAeroport = newNomAeroport;
   }
   
   /** @pdOid e8a270d7-8270-415f-8682-e0bd42eab5a0 */
   public Aeroport() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public Ville[] getVille() {
      return ville;
   }
   
   /** @pdGenerated default setter
     * @param newVille */
   public void setVille(Ville[] newVille) {
      this.ville = newVille;
   }
   /** @pdGenerated default getter */
   public Volcomplet[] getArrive() {
      return arrive;
   }
   
   /** @pdGenerated default setter
     * @param newArrive */
   public void setArrive(Volcomplet[] newArrive) {
      this.arrive = newArrive;
   }
   /** @pdGenerated default getter */
   public Volcomplet[] getDepart() {
      return depart;
   }
   
   /** @pdGenerated default setter
     * @param newDepart */
   public void setDepart(Volcomplet[] newDepart) {
      this.depart = newDepart;
   }

}
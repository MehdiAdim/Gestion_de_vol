/***********************************************************************
 * Module:  Reservation.java
 * Author:  simo
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid bf7de531-c543-4887-b867-cde1c0182d85 */
public class Reservation {
   /** @pdOid b2035515-c205-4b11-b197-fa7a843278e2 */
   private int numeroReservation;
   /** @pdOid 7ac1d272-ec69-4958-8192-188c90fe1668 */
   private Date dateReservation;
   
   /** @pdRoleInfo migr=no name=Passager assc=concerne mult=1 */
   public Passager passager;
   /** le client effectue 0 ou plusieur reservation
    * une reservation concerne unet un seul client
    * constraint frozen */
   /** @pdRoleInfo migr=no name=Client assc=effectuer mult=1 side=A */
   public Client client;
   /** @pdRoleInfo migr=no name=Vol assc=reservationVol mult=1 side=A */
   public Vol vol;
   
   /** @pdOid 6d54c23b-84f2-48c3-9f3e-1967b0997547 */
   public void annuler() {
      // TODO: implement
   }
   
   /** @pdOid ac6cc597-00f0-4150-89a9-45157ec9e6a3 */
   public void confirmer() {
      // TODO: implement
   }
   
   /** @pdOid 528b7bcc-74de-4936-87fb-2b9207cf1d08 */
   public Reservation() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Passager getPassager() {
      return passager;
   }
   
   /** @pdGenerated default parent setter
     * @param newPassager */
   public void setPassager(Passager newPassager) {
      this.passager = newPassager;
   }
   /** @pdGenerated default parent getter */
   public Client getClient() {
      return client;
   }
   
   /** @pdGenerated default parent setter
     * @param newClient */
   public void setClient(Client newClient) {
      this.client = newClient;
   }
   /** @pdGenerated default parent getter */
   public Vol getVol() {
      return vol;
   }
   
   /** @pdGenerated default parent setter
     * @param newVol */
   public void setVol(Vol newVol) {
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
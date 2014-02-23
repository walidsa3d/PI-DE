/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.MyConnection;
import Entites.Reservation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sony
 */
public class REservationDAO {

    public void ajouter(Reservation r) {
        String req = "insert into reservation (Id_Reservation,Id_Service,Id_Client,Date_De_Reservation) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1, r.getId_Reservation());
            ps.setInt(2, r.getId_Service());
            ps.setInt(3, r.getId_Client());
            ps.setString(4, r.getDate_De_Reservation());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }

    }
    
      public List<Reservation> GetAllReservation()
     {      
        
                 List<Reservation> ListeReservation = new ArrayList<Reservation>();
        try {
    
            String req = "select * from reservation";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next())
            {  Reservation r = new Reservation();
                r.setId_Reservation(resultat.getInt(1));
                r.setId_Service(resultat.getInt(2));
                r.setId_Client(resultat.getInt(3));
                r.setDate_De_Reservation(resultat.getString(4));
                
                ListeReservation.add(r);
                
                
            }
            
        } catch (SQLException ex) {
            
        }
                 
return ListeReservation;
    }
      
    
    public void Supprimer(Reservation r)
     {
         String req ="delete from reservation where id_Reservation=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,r.getId_Reservation());
            ps.executeUpdate();
             System.out.println("reservation supprimée");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
     
     public void Modifier(Reservation r) {
        String req = "update reservation set Date_de_Reservation=(?) where Id_Reservation=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(2, r.getId_Reservation());
            ps.setString(1, r.getDate_De_Reservation());
            ps.executeUpdate();
            System.out.println("Modification effectuée");
        } catch (SQLException ex) {
            System.out.println("non effectuée" + ex.getMessage());

        }
     }

}


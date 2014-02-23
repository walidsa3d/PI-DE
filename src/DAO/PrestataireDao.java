/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Connection.MyConnection;
import Entites.Prestataire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author triki
 */
public class PrestataireDao {
    

     public void ajouterPrestataire(Prestataire c) {
        String req = "insert into prestataire (Nom,Prenom,Mail,Adresse,Mot_De_Passe,Tel) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getMail());
            ps.setString(4, c.getAdress());
            ps.setString(5, c.getMot_De_Passe());
            ps.setInt(6, c.getTel());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }

    }
      public List<Prestataire> GetAllPrestataire()
     {      
        
                 List<Prestataire> ListePrestataire = new ArrayList<Prestataire>();
        try {
    
            String req = "select * from prestataire";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next())
            {  Prestataire pr = new Prestataire();
                pr.setId_Prestataire(resultat.getInt(1));
                pr.setNom(resultat.getString(2));
                pr.setPrenom(resultat.getString(3));
                pr.setMail(resultat.getString(4));
                pr.setAdress(resultat.getString(5));
                pr.setMot_De_Passe(resultat.getString(6));
                pr.setTel(resultat.getInt(7));
                ListePrestataire.add(pr);
                
                
            }
            
        } catch (SQLException ex) {
            
        }
                 
return ListePrestataire;
    }
      public void DeletePrestataire(int id)
     {
         String req ="delete from prestataire where Id_Prestataire=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,id);
            ps.executeUpdate();
             System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
        
}

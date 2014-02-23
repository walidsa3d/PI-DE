/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.MyConnection;
import Entites.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zimbala
 */
public class AdminDAO {
    
    public void ajouter(Admin d) 
    {
        String req = "insert into administrateur (Nom,prenom,mail,mot_de_passe) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, d.getNom());
            ps.setString(2, d.getPrenom());
            ps.setString(3, d.getMail());
            ps.setString(4, d.getMot_De_Passe());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }

    }
    public List<Admin> GetAllAdmin()
     {      
        
                 List<Admin> ListeAdmin = new ArrayList<Admin>();
        try {
    
            String req = "select * from administrateur";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next())
            {  Admin d = new Admin();
                d.setId_Admin(resultat.getInt(1));
                d.setNom(resultat.getString(2));
                d.setPrenom(resultat.getString(3));
                d.setMail(resultat.getString(4));
                d.setMot_De_Passe(resultat.getString(5));
               ListeAdmin.add(d);               
                
            }
            
        } catch (SQLException ex) {
            
        }
                 
    return ListeAdmin;
    
    }
    public void DeleteAdmin(int id)
     {
         String req ="delete from administrateur where id_Admin=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,id);
            ps.executeUpdate();
             System.out.println("Admin supprminimée");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
       public boolean Modifier(Admin d) throws SQLException { //void

        boolean test = false;
        String req = "update administrateur set nom=?, prenom=?,Mail=?,Mot_De_Passe=? where Id_Admin=?";
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
        ps.setInt(5, d.getId_Admin());
        ps.setString(1, d.getNom());
        ps.setString(2, d.getPrenom());
        ps.setString(3, d.getMail());
        ps.setString(4, d.getMot_De_Passe());
        if (ps.executeUpdate() != 0) {
            test = true;
        }
        return test;
    
         }
   /* public boolean Desactivate(Admin d) throws SQLException { //void

        boolean test = false;
        String req = "update administrateur set etat=0 where id=?";
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
        ps.setInt(1, pr.getId_Admin());
        
        if (ps.executeUpdate() != 0) {
            test = true;
        }
        return test;
    
         } */   
}

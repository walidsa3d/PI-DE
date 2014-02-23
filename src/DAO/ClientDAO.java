/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.MyConnection;
import Entites.Client;
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
public class ClientDAO {

    public void ajouter(Client c) {
        String req = "insert into client (Nom,prenom,mail,adresse,mot_de_passe,tel) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getMail());
            ps.setString(4, c.getAdresse());
            ps.setString(5, c.getMot_De_Passe());
            ps.setInt(6, c.getTel());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }

    }
    public Client getById(int id)
    {
        String query ="select * from client where id_client="+id;
        try{
            Statement s = MyConnection.getInstance().createStatement();
            ResultSet rs = s.executeQuery(query);
            Client c = new Client();
            while(rs.next())
            {
                c.setId_Client(rs.getInt("id_client"));
                c.setAdresse(rs.getString("adresse"));
                c.setMail(rs.getString("mail"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setTel(rs.getInt("tel"));
            }
            return c;
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
      public List<Client> GetAllClient()
     {      
        
                 List<Client> ListeClient = new ArrayList<Client>();
        try {
    
            String req = "select * from client";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next())
            {  Client c = new Client();
                c.setId_Client(resultat.getInt(1));
                c.setNom(resultat.getString(2));
                c.setPrenom(resultat.getString(3));
                c.setMail(resultat.getString(4));
                c.setAdresse(resultat.getString(5));
                c.setMot_De_Passe(resultat.getString(6));
                c.setTel(resultat.getInt(7));
                ListeClient.add(c);
                
                
            }
            
        } catch (SQLException ex) {
            
        }
                 
return ListeClient;
    }
    
    public void DeleteClient(int id)
     {
         String req ="delete from client where id_client=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,id);
            ps.executeUpdate();
             System.out.println("client supprimée");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
     
     

}

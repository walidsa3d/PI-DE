/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.MyConnection;
import Entites.Client;
import Entites.Reclamation;
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
public class ReclamationDAO {
    
    
     public List<Reclamation> GetAllReclamation()
     {      
        
                 List<Reclamation> ListeRec = new ArrayList<Reclamation>();
        try {
    
            String req = "select * from reclamation";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next())
            {  Reclamation r = new Reclamation();
                r.setId_Reclamation(resultat.getInt(1));
                r.setId_Service(resultat.getInt(2));
                r.setSujet(resultat.getString(3));
                r.setContenu(resultat.getString(4));
               
                ListeRec.add(r);
                
                
            }
            
        } catch (SQLException ex) {
            
        }
                 
return ListeRec;
    }
    
    public void DeleteClient(int id)
     {
         String req ="delete from reclamation where id_reclamation=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,id);
            ps.executeUpdate();
             System.out.println("reclamation supprimée");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
     
    
}

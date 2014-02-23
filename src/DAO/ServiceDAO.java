/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entites.Service;
import Connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hejer
 */
public class ServiceDAO {

    public void AjouterService(Service S) {


        String req = "insert into service (Id_Prestataire,Nom,Prix,Categorie,Type,Tel,Adresse) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1, S.getId_Prestataire());
            ps.setString(2, S.getNom());
            ps.setInt(3, S.getPrix());
            ps.setString(4, S.getCategorie());
            ps.setString(5, S.getType());
            ps.setInt(6, S.getTel());
            ps.setString(7, S.getAdresse());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }



    }

    public List<Service> GetAllServices() {

        List<Service> ListeService = new ArrayList<Service>();
        try {

            String req = "select * from service";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while (resultat.next()) {
                Service S = new Service();
                S.setId_Service(resultat.getInt(1));
                S.setId_Prestataire(resultat.getInt(2));
                S.setNom(resultat.getString(3));
                S.setPrix(resultat.getInt(4));
                S.setCategorie(resultat.getString(5));
                S.setType(resultat.getString(6));
                S.setTel(resultat.getInt(7));
                S.setAdresse(resultat.getString(7));


                ListeService.add(S);


            }

        } catch (SQLException ex) {
        }

        return ListeService;
    }
    
    public void DeleteService(int id)
     {
         String req ="delete from service where id_Service=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,id);
            ps.executeUpdate();
             System.out.println("Service supprimé");
        } catch (SQLException ex) {
             System.out.println("erreur "+ex.getMessage());
            
        }
                 
     }
     
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.MyConnection;
import Entites.Prestataire;

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
        String req = "insert into prestataire (Nom,Prenom,Mail,Adresse,Mot_De_Passe,Tel,Code) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(4, c.getAdress());
            ps.setString(3, c.getMail());
            ps.setString(5, c.getMot_De_Passe());
            ps.setInt(6, c.getTel());
            ps.setInt(7, c.getCode());
            ps.executeUpdate();
            System.out.println("ajout effectué");
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());

        }

    }

    public List<Prestataire> GetAllPrestataire() {

        List<Prestataire> ListePrestataire = new ArrayList<Prestataire>();
        try {

            String req = "select * from prestataire";
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while (resultat.next()) {
                Prestataire pr = new Prestataire();
                pr.setId_Prestataire(resultat.getInt(1));
                pr.setNom(resultat.getString(2));
                pr.setPrenom(resultat.getString(3));
                pr.setAdress(resultat.getString(4));
                pr.setMail(resultat.getString(5));
                pr.setMot_De_Passe(resultat.getString(6));
                pr.setTel(resultat.getInt(7));
                pr.setCode(resultat.getInt(8));
                ListePrestataire.add(pr);


            }

        } catch (SQLException ex) {
        }

        return ListePrestataire;
    }

    public void DeletePrestataire(int id) {
        String req = "delete from prestataire where Id_Prestataire=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur " + ex.getMessage());

        }

    }

    public void Modifier(Prestataire p) {
        String req = "update prestataire set Code=(?) where Id_Prestataire=(?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(2, p.getId_Prestataire());
            ps.setInt(1, p.getCode());
            ps.executeUpdate();
            System.out.println("Modification effectuée");
        } catch (SQLException ex) {
            System.out.println("non effectuée" + ex.getMessage());

        }
    }
}

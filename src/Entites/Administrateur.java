/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Administrateur {
    private int Id_Admin;
    private String Nom;
    private String Prenom;
    private String Mail;
    private String Mot_De_Passe;

    public Administrateur() {
    }

    public Administrateur(int Id_Admin, String Nom, String Prenom, String Mail, String Mot_De_Passe) {
        this.Id_Admin = Id_Admin;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Mail = Mail;
        this.Mot_De_Passe = Mot_De_Passe;
    }

    public int getId_Admin() {
        return Id_Admin;
    }

    public void setId_Admin(int Id_Admin) {
        this.Id_Admin = Id_Admin;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getMot_De_Passe() {
        return Mot_De_Passe;
    }

    public void setMot_De_Passe(String Mot_De_Passe) {
        this.Mot_De_Passe = Mot_De_Passe;
    }
    
    
}

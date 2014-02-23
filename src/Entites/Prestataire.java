/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;



/**
 *
 * @author triki
 */
public class Prestataire {
    
    
    private  int Id_Prestataire;
    private String Nom;
    private String Prenom;
    private String Adress;
    private String Mail ;
    private String Mot_De_Passe;
    private int Tel;

    
    public Prestataire()
    {}
    
    public Prestataire(int Id_Prestataire, String Nom, String Prenom, String Adress, String Mail, String Mot_De_Passe, int Tel) {
        this.Id_Prestataire = Id_Prestataire;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adress = Adress;
        this.Mail = Mail;
        this.Mot_De_Passe = Mot_De_Passe;
        this.Tel = Tel;
    }


    public int getId_Prestataire() {
        return Id_Prestataire;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getAdress() {
        return Adress;
    }

    public String getMail() {
        return Mail;
    }

    public String getMot_De_Passe() {
        return Mot_De_Passe;
    }

    public int getTel() {
        return Tel;
    }

   

    public void setId_Prestataire(int Id_Prestataire) {
        this.Id_Prestataire = Id_Prestataire;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setMot_De_Passe(String Mot_De_Passe) {
        this.Mot_De_Passe = Mot_De_Passe;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Prestataire{" + "Id_Prestataire=" + Id_Prestataire + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Adress=" + Adress + ", Mail=" + Mail + ", Mot_De_Passe=" + Mot_De_Passe + ", Tel=" + Tel + '}';
    }
}


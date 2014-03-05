/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Client {
    
    private int Id_Client;
    private String Nom;
    private String Prenom;
    private String Mail;
    private String Adresse;
    private String Mot_De_Passe;
    private int Tel;
    private int Code;

    public Client() {
        Code=0;
    }

    public Client(int Id_Client, String Nom, String Prenom, String Mail, String Adresse, String Mot_De_Passe, int Tel,int Code) {
        this.Id_Client = Id_Client;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Mail = Mail;
        this.Adresse = Adresse;
        this.Mot_De_Passe = Mot_De_Passe;
        this.Tel = Tel;
        this.Code=Code;
    }

    public int getId_Client() {
        return Id_Client;
    }

    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
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

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getMot_De_Passe() {
        return Mot_De_Passe;
    }

    public void setMot_De_Passe(String Mot_De_Passe) {
        this.Mot_De_Passe = Mot_De_Passe;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }
    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }
    
    
}

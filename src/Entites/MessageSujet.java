/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class MessageSujet {
    private int Id_Sujet;
    private String Auteur;
    private String Titre;
    private int Date_Derniere_Reponse;

    public MessageSujet() {
    }

    public MessageSujet(int Id_Sujet, String Auteur, String Titre, int Date_Derniere_Reponse) {
        this.Id_Sujet = Id_Sujet;
        this.Auteur = Auteur;
        this.Titre = Titre;
        this.Date_Derniere_Reponse = Date_Derniere_Reponse;
    }

    public int getId_Sujet() {
        return Id_Sujet;
    }

    public void setId_Sujet(int Id_Sujet) {
        this.Id_Sujet = Id_Sujet;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public int getDate_Derniere_Reponse() {
        return Date_Derniere_Reponse;
    }

    public void setDate_Derniere_Reponse(int Date_Derniere_Reponse) {
        this.Date_Derniere_Reponse = Date_Derniere_Reponse;
    }
    
    
    
}

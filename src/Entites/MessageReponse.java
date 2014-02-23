/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class MessageReponse {
    private int ID_Reponse;
    private String Auteur;
    private String Message;
    private int Date_Reponse;
    private int Correspondance_Sujet;

    public MessageReponse() {
    }

    public MessageReponse(int ID_Reponse, String Auteur, String Message, int Date_Reponse, int Correspondance_Sujet) {
        this.ID_Reponse = ID_Reponse;
        this.Auteur = Auteur;
        this.Message = Message;
        this.Date_Reponse = Date_Reponse;
        this.Correspondance_Sujet = Correspondance_Sujet;
    }

    public int getID_Reponse() {
        return ID_Reponse;
    }

    public void setID_Reponse(int ID_Reponse) {
        this.ID_Reponse = ID_Reponse;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getDate_Reponse() {
        return Date_Reponse;
    }

    public void setDate_Reponse(int Date_Reponse) {
        this.Date_Reponse = Date_Reponse;
    }

    public int getCorrespondance_Sujet() {
        return Correspondance_Sujet;
    }

    public void setCorrespondance_Sujet(int Correspondance_Sujet) {
        this.Correspondance_Sujet = Correspondance_Sujet;
    }
    
    
    
}

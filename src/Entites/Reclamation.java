/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Reclamation {
    private int Id_Reclamation;
    private int Id_Service;
    private String Sujet;
    private String Contenu;

    public Reclamation() {
    }

    public Reclamation(int Id_Reclamation, int Id_Service, String Sujet) {
        this.Id_Reclamation = Id_Reclamation;
        this.Id_Service = Id_Service;
        this.Sujet = Sujet;
    }

    public int getId_Reclamation() {
        return Id_Reclamation;
    }

    public void setId_Reclamation(int Id_Reclamation) {
        this.Id_Reclamation = Id_Reclamation;
    }

    public int getId_Service() {
        return Id_Service;
    }

    public void setId_Service(int Id_Service) {
        this.Id_Service = Id_Service;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String Sujet) {
        this.Sujet = Sujet;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String Contenu) {
        this.Contenu = Contenu;
    }
    
    
}

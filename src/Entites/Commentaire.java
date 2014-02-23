/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Commentaire {
    private int Id_Commentaire;
    private int Id_Service;
    private String Contenu;

    public Commentaire() {
    }

    public Commentaire(int Id_Commentaire, int Id_Service, String Contenu) {
        this.Id_Commentaire = Id_Commentaire;
        this.Id_Service = Id_Service;
        this.Contenu = Contenu;
    }

    public int getId_Commentaire() {
        return Id_Commentaire;
    }

    public void setId_Commentaire(int Id_Commentaire) {
        this.Id_Commentaire = Id_Commentaire;
    }

    public int getId_Service() {
        return Id_Service;
    }

    public void setId_Service(int Id_Service) {
        this.Id_Service = Id_Service;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String Contenu) {
        this.Contenu = Contenu;
    }
    
    
    
}

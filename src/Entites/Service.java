/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Service {

    private int Id_Service;
    private int Id_Prestataire;
    private String Nom;
    private int Prix;
    private String Categorie;
    private String Type;
    private int Tel;
    private String Adresse;

    public Service() {
    }

    public Service(int Id_Service, int Id_Prestataire, String Nom, int Prix, String Categorie, String Type, int Tel, String Adresse) {
        this.Id_Service = Id_Service;
        this.Id_Prestataire = Id_Prestataire;
        this.Nom = Nom;
        this.Prix = Prix;
        this.Categorie = Categorie;
        this.Type = Type;
        this.Tel = Tel;
        this.Adresse = Adresse;
    }

    public int getId_Service() {
        return Id_Service;
    }

    public void setId_Service(int Id_Service) {
        this.Id_Service = Id_Service;
    }

    public int getId_Prestataire() {
        return Id_Prestataire;
    }

    public void setId_Prestataire(int Id_Prestataire) {
        this.Id_Prestataire = Id_Prestataire;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String Categorie) {
        this.Categorie = Categorie;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
    
    
}

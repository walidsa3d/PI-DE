/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Sony
 */
public class Reservation {
    
    private int Id_Reservation;
    private int Id_Service;
    private int Id_Client;
    private String Date_De_Reservation;

    public Reservation() {
    }

    public Reservation(int Id_Reservation, int Id_Service, int Id_Client, String Date_De_Reservation) {
        this.Id_Reservation = Id_Reservation;
        this.Id_Service = Id_Service;
        this.Id_Client = Id_Client;
        this.Date_De_Reservation = Date_De_Reservation;
    }

    public int getId_Reservation() {
        return Id_Reservation;
    }

    public void setId_Reservation(int Id_Reservation) {
        this.Id_Reservation = Id_Reservation;
    }

    public int getId_Service() {
        return Id_Service;
    }

    public void setId_Service(int Id_Service) {
        this.Id_Service = Id_Service;
    }

    public int getId_Client() {
        return Id_Client;
    }

    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }

    public String getDate_De_Reservation() {
        return Date_De_Reservation;
    }

    public void setDate_De_Reservation(String Date_De_Reservation) {
        this.Date_De_Reservation = Date_De_Reservation;
    }
    
    
    
}

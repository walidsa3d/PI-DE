/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import DAO.REservationDAO;
import Entites.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sony
 */
public class ListeReservationControlleur extends AbstractTableModel {

    String[] headers ={"Id_Reservation", "Id_Service","Id_Client","Date_de_Reservation"};
    List<Reservation> MesReservations = new ArrayList<Reservation>();

    public ListeReservationControlleur() {
        REservationDAO dao = new REservationDAO();
        MesReservations = dao.GetAllReservation();
    }

    @Override
    public int getRowCount() {
        return MesReservations.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return MesReservations.get(rowIndex).getId_Reservation();
            case 1:
                return MesReservations.get(rowIndex).getId_Service();
            case 2:
                return MesReservations.get(rowIndex).getId_Client();
            case 3:
                return MesReservations.get(rowIndex).getDate_De_Reservation();
            case 4:
              
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
}


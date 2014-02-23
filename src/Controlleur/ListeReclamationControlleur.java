/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import DAO.ReclamationDAO;
import Entites.Client;
import Entites.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sony
 */
public class ListeReclamationControlleur extends AbstractTableModel{
    
     String[] headers ={"IdReclamation", "Id_Service","Sujet","Contenu"};
    List<Reclamation> MesRec = new ArrayList<Reclamation>();

    public ListeReclamationControlleur() {
        ReclamationDAO dao = new ReclamationDAO();
        MesRec=dao.GetAllReclamation();
        
    }

    @Override
    public int getRowCount() {
        return MesRec.size();
        
  
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return MesRec.get(rowIndex).getId_Reclamation();
            case 1:
                return MesRec.get(rowIndex).getId_Service();
            case 2:
                return MesRec.get(rowIndex).getSujet();
            case 3:
                return MesRec.get(rowIndex).getSujet();
                  default:
                return null;}
    }
     @Override
    public String getColumnName(int column) {
        return headers[column];
    }
}

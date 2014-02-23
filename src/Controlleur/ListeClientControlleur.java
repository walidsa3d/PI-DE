/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import DAO.ClientDAO;
import Entites.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sony
 */
public class ListeClientControlleur extends AbstractTableModel {

    String[] headers ={"IdClient", "Nom","Prenom","Adresse","Mail","Mot De passe","Telephone"};
    List<Client> MesClient = new ArrayList<Client>();

    public ListeClientControlleur() {
        ClientDAO dao = new ClientDAO();
        MesClient = dao.GetAllClient();
    }

    @Override
    public int getRowCount() {
        return MesClient.size();

    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {


        switch (columnIndex) {
            case 0:
                return MesClient.get(rowIndex).getId_Client();
            case 1:
                return MesClient.get(rowIndex).getNom();
            case 2:
                return MesClient.get(rowIndex).getPrenom();
            case 3:
                return MesClient.get(rowIndex).getMail();
            case 4:
                return MesClient.get(rowIndex).getAdresse();
            case 5:
                return MesClient.get(rowIndex).getMot_De_Passe();
            case 6:
                return MesClient.get(rowIndex).getTel();


            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
}

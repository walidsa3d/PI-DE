/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import DAO.AdminDAO;
import Entites.Admin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Zimbala
 */
public class ListeAdminControlleur extends AbstractTableModel
{
    String[] headers ={"IdAdmin", "Nom","Prenom","Mail","Mot De passe"};
    List<Admin> MesAdmin = new ArrayList<Admin>();

    public ListeAdminControlleur() {
        AdminDAO dao = new AdminDAO();
        MesAdmin = dao.GetAllAdmin();
    }

    @Override
    public int getRowCount() {
        return MesAdmin.size();

    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {


        switch (columnIndex) {
            case 0:
                return MesAdmin.get(rowIndex).getId_Admin();
            case 1:
                return MesAdmin.get(rowIndex).getNom();
            case 2:
                return MesAdmin.get(rowIndex).getPrenom();
            case 3:
                return MesAdmin.get(rowIndex).getMail();
            case 4:
                return MesAdmin.get(rowIndex).getMot_De_Passe();
            
             default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
}

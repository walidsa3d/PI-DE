/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import DAO.PrestataireDao;
import Connection.MyConnection;
import Entites.Prestataire;
/**
 *
 * @author triki
 */
public class ListePrestataireControlleur extends AbstractTableModel  {
   

    String[] headers ={"IdPrestataire", "Nom","Prenom","Adresse","Mail","Mot De passe","Telephone","Code"};
    List<Prestataire> MesPrestataires = new ArrayList<Prestataire>();

    public ListePrestataireControlleur() {
        PrestataireDao dao = new PrestataireDao();
        MesPrestataires = dao.GetAllPrestataire();
    }

    @Override
    public int getRowCount() {
        return MesPrestataires.size();

    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {


        switch (columnIndex) {
            case 0:
                return MesPrestataires.get(rowIndex).getId_Prestataire();
            case 1:
                return MesPrestataires.get(rowIndex).getNom();
            case 2:
                return MesPrestataires.get(rowIndex).getPrenom();
            case 3:
                   return MesPrestataires.get(rowIndex).getAdress();
            case 4:
                return MesPrestataires.get(rowIndex).getMail();
            case 5:
                return MesPrestataires.get(rowIndex).getMot_De_Passe();
            case 6:
                return MesPrestataires.get(rowIndex).getTel();
            case 7:
                return MesPrestataires.get(rowIndex).getCode();


            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
    
}

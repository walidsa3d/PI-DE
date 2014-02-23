/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import DAO.ServiceDAO;
import Entites.Service;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hejer
 */
public class ListeServiceControlleur extends AbstractTableModel{
    
    String[] headers ={"IdService","IdPrestataire","Nom","Prix","Categorie","Type","Tel","Adresse"};
    List<Service>MesServices  = new ArrayList<Service>();
    public ListeServiceControlleur()
    {
        ServiceDAO dao=new ServiceDAO();
        MesServices=dao.GetAllServices();
        
    }
    
    
    
    
    
    
    
    
    

    @Override
    public int getRowCount() {
        return MesServices.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
                return MesServices.get(rowIndex).getId_Service();
            case 1:
                return MesServices.get(rowIndex).getId_Prestataire();
            case 2:
                return MesServices.get(rowIndex).getNom();
            case 3:
                return MesServices.get(rowIndex).getPrix();
                        
            case 4:
                return MesServices.get(rowIndex).getCategorie();
            case 5:
                return MesServices.get(rowIndex).getType();
            case 6:
                return MesServices.get(rowIndex).getTel();
            case 7:
                return MesServices.get(rowIndex).getAdresse();


            default:
                return null;
        }
        
        
        
        
    }
    @Override
     public String getColumnName(int column) {
        return headers[column];
    }
    
}

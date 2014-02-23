/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sony
 */
public class MyConnection {
    private static final String Driver ="com.mysql.jdbc.Driver";
    private static  final String url ="jdbc:mysql://127.0.0.1:3306/wedding";
    private  static final String user = "root";
    private static  final String pwd ="";
    
    private static Connection con;
      private MyConnection() {
    }
    public Connection etablir()
    {
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("connexion etabli");
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erreur de driver"+ex.getMessage());
            
        } catch (SQLException ex) {
            System.out.println("erreur de connexion"+ex.getMessage());
           
        }
        return con;
    }
    
    public static Connection getInstance()
    {
        if (con==null)
            con=new MyConnection().etablir();
        return con;
    }
    
    
    
}

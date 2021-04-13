package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlackSterben
 */
public class Conexion {

    private static Connection cnx = null;
    //private String driver="com.mysql.jdbc.Driver";

//    public java.sql.Connection connection() throws SQLException { //metodo login
//        try {
//
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestionclientes", "BlackSterben", "37gfe57rue");
//            } catch (SQLException ex) {
//                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cnx;
//    }

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        String driver="com.mysql.jdbc.Driver";
        //String driver=null;
        if (cnx == null) {
            try {
                Class.forName(driver);
                cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestionclientes", "BlackSterben", "37gfe57rue");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } 
        }
        return cnx;
    }
}

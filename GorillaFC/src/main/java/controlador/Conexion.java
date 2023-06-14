
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conexion;

    public static void conectar() {
        String url = "jdbc:mysql://localhost:3306/gorillafc?serverTimezone=America/Bogota";
        String usr = "root";
        String ctr = "admin";
        try {
            conexion = DriverManager.getConnection(url, usr, ctr);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        Conexion.conexion = conexion;
    }
    
    
}

package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Escenario_deportivo;

public class CEscenario {
    public static void registrarEscenariod(int id_escenario, String nombre, String ubicacion, String tipo_escenario){
        try{
            Escenario_deportivo ed= new Escenario_deportivo(id_escenario,nombre,ubicacion,tipo_escenario);
            Statement st=Conexion.getConexion().createStatement();
            st.execute("insert into escenario_deportivo values ('" + ed.getId_escenario() + "','" + ed.getNombre() + "','" + ed.getUbicacion() + "','" + ed.getTipo_escenario() + "')");
            JOptionPane.showMessageDialog(null, "Se añadio correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo añadir!!");
        }
    }
    
    public static void modificarEscenariod(int id_escenario, String nombre, String ubicacion, String tipo_escenario){
        try{
            Statement st=Conexion.getConexion().createStatement();
            st.execute("update escenario_deportivo set nombre='" + nombre +"',ubicacion='" + ubicacion + "',tipo_escenario='" + tipo_escenario + "' where id_escenario = '" + id_escenario + "'");
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
        }
    }
    
    public static void eliminarEscenariod(int id_escenario){
        try{
            Statement st=Conexion.getConexion().createStatement();
            st.execute("delete from escenario_deportivo where id_escenario ='" + id_escenario + "'");
            JOptionPane.showMessageDialog(null, "Se elimino correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet consultarPorId(int id_escenario){
        ResultSet rs=null;
        try{
            Statement st=Conexion.getConexion().createStatement();
            rs=st.executeQuery("Select * from escenario_deportivo where id_escenario='" + id_escenario + "'");
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static ResultSet consultarEscenario(){
        ResultSet rs = null;
        try{
            Statement st=Conexion.getConexion().createStatement();
            rs=st.executeQuery("Select * from escenario_deportivo");
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
    public static void pintarTabla(JTable tabla, ResultSet rs){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID ESCENARIO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("UBICACION");
        modelo.addColumn("TIPO");
        
        try{
            while(rs.next()){
                String[]fila={rs.getString("id_escenario"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getString("tipo_escenario")};
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException ex){
            Logger.getLogger(CEscenario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

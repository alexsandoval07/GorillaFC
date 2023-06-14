
package controlador;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleados;


public class CEmpleado {
    public static void registrarEmpleado(int codigo_empleado, String nombre_empleado, String fecha_nacimiento, String direccion, String telefono, int id_empleado) throws SQLException {
        try{
            Empleados e = new Empleados(codigo_empleado, nombre_empleado, fecha_nacimiento, direccion, telefono, id_empleado);
            Statement st= Conexion.getConexion().createStatement();
            st.execute("insert into empleados values('" + e.getCodigo_empleado() + "','" + e.getNombre_empleado() + "','" + e.getFecha_nacimiento() + "','" + e.getDireccion() + "','" + e.getTelefono() + "','" + e.getId_empleado() + "')");
            JOptionPane.showMessageDialog(null, "Se añadio correctamente !!");
        }
        catch (SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo añadir !!");
        }
    }
    
    public static void modificarEmpleado(int codigo_empleado, String nombre_empleado,String fecha_nacimiento,String direccion,String telefono,int id_empleado){
        try{
            Statement st= Conexion.getConexion().createStatement();
            st.execute("update empleados set codigo_empleado='" + codigo_empleado + "', nombre_empleado='" + nombre_empleado + "',fecha_nacimiento='" + fecha_nacimiento + "',direccion='" + direccion + "',telefono='" + telefono + "',id_empleado'" + id_empleado + "' where codigo_empleado ='" + codigo_empleado + "'");
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo actualizar !!");
        }
    }
    
    public static void eliminarEmpleado(int codigo_empleado){
        try{
            Statement st= Conexion.getConexion().createStatement();
            st.execute("delete from empleados where codigo_empleado='" + codigo_empleado + "'");
            JOptionPane.showMessageDialog(null, "Eliminado correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo eliminar !!");
        }
    }
    
    public static ResultSet consultarPorCodigo(int codigo_empleado) {
        ResultSet rs=null;
        try{
            Statement st= Conexion.getConexion().createStatement();
            rs = st.executeQuery("select * from empleados where codigo_empleado='" + codigo_empleado + "'");
        }
        catch (SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static ResultSet consultarEmpleados(){
        ResultSet rs = null;
        try{
            Statement st= Conexion.getConexion().createStatement();
            rs = st.executeQuery("select * from empleados;");
            
        }
        catch (SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
       
    }
    
    public static void pintarTabla(JTable tabla, ResultSet rs){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("FECHA NACIMIENTO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("ID");
        
        try{
            while(rs.next()){
                String[]fila={rs.getString("codigo_empleado"),rs.getString("nombre_empleado"),rs.getString("fecha_nacimiento"),rs.getString("direccion"),rs.getString("telefono"),rs.getString("id_empleado")};
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException ex){
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

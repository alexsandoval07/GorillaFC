
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class CCategoria {
    public static void registrar_categoria(int codigo_categoria, String nombre_categoria){
        try{
            Categoria c=new Categoria(codigo_categoria,nombre_categoria);
            Statement st=Conexion.getConexion().createStatement();
            st.execute("insert into categoria values ('" + c.getCodigo_categoria()+ "','" + c.getNombre_categoria() + "')");
            JOptionPane.showMessageDialog(null, "Se añadio correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo registrar!!");
        }
    }
    
    public static void modificar_categoria(int codigo_categoria, String nombre_categoria){
        try{
            Statement st=Conexion.getConexion().createStatement();
            st.execute("update categoria set nombre_categoria='" + nombre_categoria + "' where codigo_categoria ='" + codigo_categoria +"'");
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
        }
    }
    
    public static void eliminar_categoria(int codigo_categoria){
        try{
            Statement st=Conexion.getConexion().createStatement();
            st.execute("delete from categoria where codigo_categoria='" + codigo_categoria + "'");
            JOptionPane.showMessageDialog(null, "Se elimino correctamente !!");
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet consultarPorCodigo(int codigo_categoria){
        ResultSet rs = null;
        try{
            Statement st=Conexion.getConexion().createStatement();
            rs=st.executeQuery("Select * from categoria where codigo_categoria='" + codigo_categoria + "'");
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static ResultSet consultarCategoria(){
        ResultSet rs = null;
        try{
            Statement st=Conexion.getConexion().createStatement();
            rs=st.executeQuery("Select * from categoria");
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static void pintarTabla(JTable tabla, ResultSet rs){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        
        try{
            while(rs.next()){
                String[]fila={rs.getString("codigo_categoria"),rs.getString("nombre_categoria")};
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException ex){
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

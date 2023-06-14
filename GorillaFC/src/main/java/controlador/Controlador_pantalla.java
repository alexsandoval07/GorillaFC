
package controlador;

import vista.VCategoria;
import vista.VEmpleado;
import vista.VEscenario_deportivo;
import vista.Vpantalla;


public class Controlador_pantalla {
    
    private static Vpantalla pantalla_principal;

    public static void abrir_pantalla() {
        if (pantalla_principal == null) {
            pantalla_principal = new Vpantalla();
        }
        
        pantalla_principal.setVisible(true);
        pantalla_principal.setLocationRelativeTo(null);
    }

    public static void cerrar_pantalla() {
        pantalla_principal.setVisible(false);
        pantalla_principal = null;
    }
    
    private static VEmpleado pantalla_empleado;
    
    public static void abrir_pantallaE() {
        if (pantalla_empleado == null) {
            pantalla_empleado = new VEmpleado();
        }
        
        pantalla_empleado.setVisible(true);
        pantalla_empleado.setLocationRelativeTo(null);
    }

    public static void cerrar_pantallaE() {
        pantalla_empleado.setVisible(false);
        pantalla_empleado = null;
    }
    
    private static VCategoria pantalla_categoria;
    
    public static void abrir_pantalla_categoria(){
        if(pantalla_categoria ==null){
            pantalla_categoria= new VCategoria();
        }
        pantalla_categoria.setVisible(true);
        pantalla_categoria.setLocationRelativeTo(null);
    }
    
    public static void cerrar_pantalla_categoria(){
        pantalla_categoria.setVisible(false);
        pantalla_categoria = null;
    }
    
    private static VEscenario_deportivo pantalla_ed;
    public static void abrir_pantalla_ed(){
        if(pantalla_ed ==null){
            pantalla_ed= new VEscenario_deportivo();
        }
        pantalla_ed.setVisible(true);
        pantalla_ed.setLocationRelativeTo(null);
    }
    
    public static void cerrar_pantalla_ed(){
        pantalla_ed.setVisible(false);
        pantalla_ed = null;
    }
   
}

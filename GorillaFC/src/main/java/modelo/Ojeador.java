
package modelo;

public class Ojeador {
    private int id_ojeador;
    private String nombre;

    public Ojeador(int id_ojeador, String nombre) {
        this.id_ojeador = id_ojeador;
        this.nombre = nombre;
    }

    public int getId_ojeador() {
        return id_ojeador;
    }

    public void setId_ojeador(int id_ojeador) {
        this.id_ojeador = id_ojeador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ojeador{" + "id_ojeador=" + id_ojeador + ", nombre=" + nombre + '}';
    }
    
    
    
}

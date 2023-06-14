
package modelo;

public class Patrocinador {
    private int id_patrocinador;
    private String nombre;

    public Patrocinador(int id_patrocinador, String nombre) {
        this.id_patrocinador = id_patrocinador;
        this.nombre = nombre;
    }

    public int getId_patrocinador() {
        return id_patrocinador;
    }

    public void setId_patrocinador(int id_patrocinador) {
        this.id_patrocinador = id_patrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Patrocinador{" + "id_patrocinador=" + id_patrocinador + ", nombre=" + nombre + '}';
    }
    
    
}

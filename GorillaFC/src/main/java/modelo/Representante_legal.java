
package modelo;

public class Representante_legal {
    private int id_representante_legal;
    private String nombre;
    private String telefono;

    public Representante_legal(int id_representante_legal, String nombre, String telefono) {
        this.id_representante_legal = id_representante_legal;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId_representante_legal() {
        return id_representante_legal;
    }

    public void setId_representante_legal(int id_representante_legal) {
        this.id_representante_legal = id_representante_legal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Representante_legal{" + "id_representante_legal=" + id_representante_legal + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
